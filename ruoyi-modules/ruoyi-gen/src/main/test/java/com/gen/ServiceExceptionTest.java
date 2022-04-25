package java.com.gen;


import com.ruoyi.gen.domain.GenTable;
import com.ruoyi.gen.domain.GenTableColumn;
import com.ruoyi.gen.service.IGenTableColumnService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@RequiredArgsConstructor
@Slf4j
class ServiceExceptionTest {
    private final IGenTableColumnService iGenTableColumnService;

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
        boolean tree = GenTable.isTree("");
        boolean tree1 = GenTable.isCrud("");
        boolean tree2 = GenTable.isSuperColumn("", "");
        log.info("{}", tree2);
        boolean tree3 = GenTable.isSub("");
        log.info("{}", tree3);
        log.info("{}", tree);
        log.info("{}", tree1);
        GenTableColumn gt = new GenTableColumn();
        log.info("{}", gt.getTableId());
        gt.setColumnName("");
        log.info("{}", gt.getColumnComment());
        gt.setColumnComment("");
        log.info("{}", gt.getCapJavaField());
        log.info("{}", gt.isIncrement());
        log.info("{}", gt.isEdit());
        log.info("{}", gt.isEdit(""));
        log.info("{}", gt.isRequired());
        log.info("{}", gt.isQuery(""));
        log.info("{}", gt.readConverterExp());
        log.info("{}", gt.getJavaField());
        log.info("{}", gt.getIsPk());
        log.info("{}", gt.getIsIncrement());
        log.info("{}", gt.getIsEdit());
        log.info("{}", gt.getIsList());
        log.info("{}", gt.getIsQuery());
        log.info("{}", gt.getSort());
        log.info("{}", gt.getIsInsert());
        gt.setColumnType("");
        gt.setJavaField("");
        gt.setIsPk("");
        gt.setIsIncrement("");
        gt.setSort(0);
        int arg = iGenTableColumnService.insertGenTableColumn(new GenTableColumn());
        log.info("{}", arg);
        log.info("{}", iGenTableColumnService.updateGenTableColumn(null));
        log.info("{}", iGenTableColumnService.deleteGenTableColumnByIds(null));
        log.info("{}", iGenTableColumnService.insertGenTableColumn(null));
    }
}