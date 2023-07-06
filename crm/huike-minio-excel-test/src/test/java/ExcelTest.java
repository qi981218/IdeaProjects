import com.alibaba.excel.EasyExcel;
import domain.vo.TbClueExcelVo;
import org.junit.jupiter.api.Test;

public class ExcelTest {

    @Test
    public void excelTest(){
        EasyExcel.read("部分数据.xls", TbClueExcelVo.class,new ClueDataListener()).sheet().doRead();
    }

}
