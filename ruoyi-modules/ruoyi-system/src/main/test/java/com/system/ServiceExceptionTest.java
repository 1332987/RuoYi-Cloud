package java.com.system;


import com.ruoyi.system.domain.*;
import com.ruoyi.system.mapper.*;
import com.ruoyi.system.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@RequiredArgsConstructor
@Slf4j
class ServiceExceptionTest {
    private final SysConfigMapper sysConfigMapper;
    private final SysDeptMapper sysDeptMapper;
    private final SysDictDataMapper sysDictDataMapper;
    private final SysDictTypeMapper sysDictTypeMapper;
    private final SysLogininforMapper sysLogininforMapper;
    private final SysMenuMapper sysMenuMapper;
    private final SysRoleDeptMapper sysRoleDeptMapper;
    private final SysRoleMapper sysRoleMapper;
    private final SysRoleMenuMapper sysRoleMenuMapper;
    private final SysUserPostMapper sysUserPostMapper;
    private final SysUserRoleMapper sysUserRoleMapper;
    private final ISysDictDataService iSysDictDataService;
    private final ISysDictTypeService iSysDictTypeService;
    private final ISysNoticeService iSysNoticeService;
    private final ISysOperLogService iSysOperLogService;
    private final ISysPostService iSysPostService;
    private final ISysRoleService iSysRoleService;
    private final ISysUserService iSysUserService;

    @BeforeEach
    void setUp() {
        System.out.println("up");
    }

    @AfterEach
    void tearDown() {
        System.out.println("down");
    }

    @Test
    void testThirdTest() {
        SysConfig sc = new SysConfig();
        sc.setConfigName("");
        sc.setConfigValue("");
        sc.setConfigType("");
        SysMenu sm = new SysMenu();
        sm.setMenuName("");
        log.info("{}", sm.getParentName());
        log.info("{}", sm);
        log.info("{}", sc);
        sm.setParentName("");
        sm.setParentId(1L);
        sm.setOrderNum(1);
        sm.setPath("");
        sm.setComponent("");
        sm.setIsFrame("");
        sm.setIsCache("");
        sm.setMenuType("");
        sm.setVisible("");
        sm.setPerms("");
        sm.setIcon("");
        sm.setMenuId(1L);
        SysNotice sn = new SysNotice();
        log.info("{}", sn);
        sn.setNoticeTitle("");
        sn.setNoticeType("");
        sn.setNoticeId(1L);
        sn.setNoticeContent("");
        SysPost sp = new SysPost();
        sp.setPostName("");
        sp.setPostCode("");
        sp.setPostId(1L);
        sp.setPostSort("");
        log.info("{}", sp.isFlag());
        log.info("{}", sp);
        sp.setFlag(true);
        SysUserOnline su = new SysUserOnline();
        log.info("{}", su.getTokenId());
        log.info("{}", su.getIpaddr());
        log.info("{}", su.getLoginLocation());
        su.setLoginLocation("");
        log.info("{}", su.getBrowser());
        su.setBrowser("");
        su.setOs("");
        log.info("{}", su.getOs());
        log.info("{}", su.getLoginTime());
        log.info("{}", su);
        log.info("{}", sysMenuMapper.selectMenuPerms());
        log.info("{}", sysLogininforMapper.cleanLogininfor());
        log.info("{}", sysDictTypeMapper.deleteDictTypeById(1L));
        log.info("{}", sysDictTypeMapper.deleteDictTypeById(1L));
        log.info("{}", sysDictTypeMapper.deleteDictTypeByIds(null));
        log.info("{}", sysConfigMapper.deleteConfigById(1L));
        log.info("{}", sysConfigMapper.deleteConfigByIds(null));
        log.info("{}", sysDeptMapper.updateDeptChildren(null));
        log.info("{}", sysDictDataMapper.deleteDictDataById(null));
        log.info("{}", sysDictDataMapper.deleteDictDataByIds(null));
        log.info("{}", sysDictDataMapper.updateDictDataType(null, ""));

        log.info("{}", iSysNoticeService.deleteNoticeById(null));
        log.info("{}", iSysOperLogService.selectOperLogById(null));
        log.info("{}", iSysPostService.deletePostById(null));
        log.info("{}", iSysRoleService.selectRoleListByUserId(null));
        log.info("{}", iSysRoleService.deleteRoleById(null));
        log.info("{}", iSysUserService.deleteUserById(null));

        log.info("{}", sysRoleDeptMapper.selectCountRoleDeptByDeptId(1L));
        log.info("{}", sysRoleDeptMapper.deleteRoleDeptByRoleId(1L));
        log.info("{}", sysRoleDeptMapper.deleteRoleDept(null));
        log.info("{}", sysRoleMapper.selectRoleAll());
        log.info("{}", sysRoleMapper.insertRole(null));
        log.info("{}", sysRoleMenuMapper.deleteRoleMenuByRoleId(null));
        log.info("{}", sysRoleMenuMapper.deleteRoleMenu(null));
        log.info("{}", sysUserPostMapper.deleteUserPostByUserId(null));
        log.info("{}", sysUserPostMapper.deleteUserPost(null));
        log.info("{}", sysUserRoleMapper.deleteUserRoleByUserId(null));
        log.info("{}", sysUserRoleMapper.deleteUserRole(null));
        log.info("{}", iSysDictTypeService.selectDictTypeByType(null));
        log.info("{}", iSysDictDataService.selectDictLabel(null,""));
    }
}