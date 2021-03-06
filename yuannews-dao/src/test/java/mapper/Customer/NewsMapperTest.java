package mapper.Customer;

import org.junit.Test;
import yuan.ssm.common.util.LoggerUtil;
import yuan.ssm.other.CommentJo;
import yuan.ssm.pojo.NewsCustom;
import yuan.ssm.vo.CateVo;
import yuan.ssm.vo.SourceVo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * ==================================================
 * <p/>
 * 版权：　软件工程.net12-1 原明卓
 * <p/>
 * 项目：　基于用户兴趣标签的新闻推荐系统
 * <p/>
 * 作者：　原明卓
 * <p/>
 * 版本：　1.0
 * <p/>
 * 创建日期：　16-4-25 下午4:53
 * <p/>
 * 功能描述： News界面数据测试类
 * <p>
 * <p/>
 * 功能更新历史：
 * <p>
 * ==================================================
 */
public class NewsMapperTest extends CustomerBaseTest{

    @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void findZanNidTest() throws Exception {
        Set<Integer> zanNid = newsMapper.findZanNid(1);
        LoggerUtil.printJSON(zanNid);
    }

    @Test
    public void findCommentNidTest() throws Exception {
        Set<Integer> zanNid = newsMapper.findCommentNid(1);
        LoggerUtil.printJSON(zanNid);
    }

    @Test
    public void findNewsByLabelTest() throws Exception {
        Set<Integer> zanNid = newsMapper.findNewsByLabel("据悉");
        LoggerUtil.printJSON(zanNid);
    }

    @Test
    public void findNewsByIdsTest() throws Exception {
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(300);
        ids.add(301);
        ids.add(240);
        ids.add(400);
        List<NewsCustom> newsCustoms = newsMapper.findNewsByIds(ids);
        LoggerUtil.printJSON(newsCustoms);
    }

    @Test
    public void findNewsByRnumTest() throws Exception {
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(300);
        ids.add(301);
        ids.add(240);
        ids.add(400);
        List<NewsCustom> newsCustoms = newsMapper.findNewsByRnum(ids);
        LoggerUtil.printJSON(newsCustoms);
    }

    @Test
    public void findNewsByZanTest() throws Exception {
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(300);
        ids.add(301);
        ids.add(240);
        ids.add(400);
        List<NewsCustom> newsCustoms = newsMapper.findNewsByZan(ids);
        LoggerUtil.printJSON(newsCustoms);
    }

    @Test
    public void findNewsByCommentTest() throws Exception {
        List<Integer> ids=new ArrayList<Integer>();
        ids.add(300);
        ids.add(301);
        ids.add(240);
        ids.add(400);
        List<NewsCustom> newsCustoms = newsMapper.findNewsByComment(ids);
        LoggerUtil.printJSON(newsCustoms);
    }

    //------------------------上面是推荐测试-----------------------------


    @Test
    public void findNewsCustomTest() throws Exception {
        List<NewsCustom> newsCustom = newsMapper.findNewsCustom(0, 10);
        LoggerUtil.printJSON(newsCustom);
    }


    @Test
    public void findAllCates() throws Exception{
        List<CateVo> allCates = newsMapper.findAllCates();
        LoggerUtil.printJSON(allCates);
    }

    @Test
    public void findAllSourcesTest() throws Exception{
        List<SourceVo> allSources = newsMapper.findAllSources();
        LoggerUtil.printJSON(allSources);
    }

    @Test
    public void findNewsCustomByZanTest() throws Exception{
        List<NewsCustom> customByZan = newsMapper.findNewsCustomByZan(0, 10);
        LoggerUtil.printJSON(customByZan);
    }

    @Test
    public void findNewsCustomByCommentTest() throws Exception{
        List<NewsCustom> customByZan = newsMapper.findNewsCustomByComment(0, 10);
        LoggerUtil.printJSON(customByZan);
    }

    @Test
    public void findNewsCustomByRnumTest() throws Exception{
        List<NewsCustom> customByZan = newsMapper.findNewsCustomByRnum(0, 10);
        LoggerUtil.printJSON(customByZan);
    }

    //---------------------------------分类查询-------------------------------------

    @Test
    public void findNewsByCateIdTest() throws Exception{
        List<NewsCustom> customByZan = cateNewsMapper.findNewsByCateId(0,10,"人文");
        LoggerUtil.printJSON(customByZan);
    }

    @Test
    public void findNewsByCateZanTest() throws Exception{
        List<NewsCustom> customByZan = cateNewsMapper.findNewsByCateZan(0,10,"社会");
        LoggerUtil.printJSON(customByZan);
    }


    //----------------------------------来源查询---------------------------------------

    @Test
    public void findNewsBySourceIdTest() throws Exception{
        List<NewsCustom> customByZan = sourceNewsMapper.findNewsBySourceId(0,10,"腾讯新闻");
        LoggerUtil.printJSON(customByZan);
    }

    @Test
    public void findNewsBySourceZanTest() throws Exception{
        List<NewsCustom> customByZan = sourceNewsMapper.findNewsBySourceZan(0,10,"搜狐新闻");
        LoggerUtil.printJSON(customByZan);
    }

    @Test
    public void findNewsBySourceCommentTest() throws Exception{
        List<NewsCustom> customByZan = sourceNewsMapper.findNewsBySourceComment(0,10,"搜狐新闻");
        LoggerUtil.printJSON(customByZan);
    }

    @Test
    public void findNewsBySourceRnumTest() throws Exception{
        List<NewsCustom> customByZan = sourceNewsMapper.findNewsBySourceRnum(0,10,"搜狐新闻");
        LoggerUtil.printJSON(customByZan);
    }

    //----------------------------------------新闻详情测试-----------------------------------------

    @Test
    public void findNewsDetailByIdTest() throws Exception{
        NewsCustom detailById = newsMapper.findNewsDetailById(2);
        LoggerUtil.printJSON(detailById);
    }

    @Test
    public void findLikedByNidTest() throws Exception{
        List<String> likedByNid = newsMapper.findLikedByNid(2);
        LoggerUtil.printJSON(likedByNid);
    }

    @Test
    public void findCommentTest() throws Exception{
        List<CommentJo> comment = newsMapper.findComment(0, 10, 2);
        LoggerUtil.printJSON(comment);
    }


}
