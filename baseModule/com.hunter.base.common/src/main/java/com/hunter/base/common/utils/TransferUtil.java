//package com.hunter.base.common.utils;
//
//import com.hunter.base.common.po.HunterBasePo;
//import com.hunter.base.common.vo.HunterBaseVo;
//import org.springframework.beans.BeanUtils;
//import org.springframework.util.CollectionUtils;
//
//import java.util.Collections;
//import java.util.List;
//
///**
// * @author Administrator
// * @date 2020/10/3
// **/
//public class TransferUtil {
//
//    public static<P extends HunterBasePo, V extends HunterBaseVo> V toVo(P source, V target){
//        BeanUtils.copyProperties(source, target);
//        return target;
//    }
//
//    public static<P extends HunterBasePo, V extends HunterBaseVo> void toVos(List<P> sourceList, List<V> targetList){
//        if(CollectionUtils.isEmpty(sourceList)){
//            sourceList.forEach(source -> {
//                v = toVo(source, v);
//            });
//
//        }
//    }
//
//    public static void toPo(Object source, Object target){
//
//    }
//
//    public static void toPos(Object source, Object target){
//
//    }
//
//}
