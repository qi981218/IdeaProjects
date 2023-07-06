import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.read.listener.ReadListener;
import com.huike.clues.domain.dto.ImportResultDTO;
import domain.vo.TbClueExcelVo;

import java.util.Map;

public class ClueDataListener2 implements ReadListener<TbClueExcelVo> {
    //注意：由于并没有将ClueDataListener2放入IoC容器，因此在此处不能从IoC容器中获取对象
    private TbClueService service;
    //成功失败条数
    private int successNum=0;
    private int errorNum=0;
    // 如果需要使用Service 可以通过构造函数传递
    public ClueDataListener2(TbClueService service) {
        this.service = service;
    }

    // 第一行是头部, 会在这里输出
    // 如果不需要打印Header 该方法可以省略
    @Override
    public void invokeHead(Map<Integer, ReadCellData<?>> headMap, AnalysisContext context) {
        headMap.forEach((key, value) -> {
            System.out.println("解析到Excle 的头部:" + value.getStringValue());
        });
    }

    // 从第二行开始读取
    @Override
    public void invoke(TbClueExcelVo data, AnalysisContext analysisContext) {
        ImportResultDTO importResultDTO = service.dealData(data);
        System.out.println(importResultDTO);
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("excle 解析完毕");
    }
}
