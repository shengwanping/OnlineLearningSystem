package com.swp.controller;

import com.swp.entity.User;
import com.swp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-11-04 09:10:25
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param userNo 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public User selectOne(Integer userNo) {
        return userService.queryById(userNo);
    }

    /**
     * 通过学号查询所有课程
     *
     * @param userNo 主键
     * @return 集合
     */
    @GetMapping("queryAllCourse")
    public List<User> queryAllCourse(@RequestParam("userNo") Integer userNo){
        return this.userService.queryAllCourse(userNo);
    };

    /**
     * 分页查询
     */
    @GetMapping("queryLimitStudent")
    public List<User> queryLimitStudent(@RequestParam("index") Integer index,@RequestParam("count")Integer count){
        return this.userService.queryLimitStudent(index,count);
    };


    @PostMapping("/upload")
    public List<File> importSqlLite(MultipartFile file, HttpServletRequest request) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
        // 在 uploadPath 文件夹中通过日期对上传的文件归类保存
        // 比如：/2021/03/11
        String format = sdf.format(new Date());
        String path = new File("").getCanonicalPath()+"\\src\\main\\resources\\upload\\";
        File folder = new File(path + format);
        if (!folder.isDirectory()) {
            //建立新的子目录
            folder.mkdirs();
        }
        File filePath= new File(folder,file.getOriginalFilename());
        try {
            // 文件保存
            file.transferTo(filePath);
        } catch (IOException e) {

        }

        List<File> _list = new ArrayList<>() ;
        try {
            ZipFile _zipFile = new ZipFile(filePath , "GBK") ;
            for(Enumeration entries = _zipFile.getEntries(); entries.hasMoreElements() ; ){
                ZipEntry entry = (ZipEntry)entries.nextElement() ;
                File _file = new File(folder.getPath() + File.separator + entry.getName()) ;
                if( entry.isDirectory() ){
                    _file.mkdirs() ;
                }else{
                    File _parent = _file.getParentFile() ;
                    if( !_parent.exists() ){
                        _parent.mkdirs() ;
                    }
                    InputStream _in = _zipFile.getInputStream((ZipArchiveEntry) entry);
                    OutputStream _out = new FileOutputStream(_file) ;
                    int len = 0 ;
                    byte[] _byte = new byte[1];
                    while( (len = _in.read(_byte)) > 0){
                        _out.write(_byte, 0, len);
                    }
                    _in.close();
                    _out.flush();
                    _out.close();
                    _list.add(_file) ;
                }
            }
        } catch (IOException e) {
        }
        // 删除压缩包
        filePath.delete();
        return _list;
    }

}