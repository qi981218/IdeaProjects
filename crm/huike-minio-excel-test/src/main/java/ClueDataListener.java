import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.read.listener.ReadListener;
import domain.vo.TbClueExcelVo;

import java.util.Map;

public class ClueDataListener implements ReadListener<TbClueExcelVo> {
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
        System.out.println("读取到了一行数据：" + data);
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
