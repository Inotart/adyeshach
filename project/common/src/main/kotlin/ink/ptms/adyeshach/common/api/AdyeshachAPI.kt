package ink.ptms.adyeshach.common.api

import ink.ptms.adyeshach.common.entity.manager.Manager
import org.bukkit.entity.Player

/**
 * Adyeshach
 * ink.ptms.adyeshach.common.api.AdyeshachAPI
 *
 * @author 坏黑
 * @since 2022/6/16 16:30
 */
interface AdyeshachAPI {

    /**
     * 初始化玩家管理器
     */
    fun setupEntityManager(player: Player)

    /**
     * 释放玩家管理器
     */
    fun releaseEntityManager(player: Player)

    /**
     * 刷新玩家管理器（重新显示所有单位）
     */
    fun refreshEntityManager(player: Player)

    /**
     * 获取公共单位管理器
     *
     * @param temporary 是否为临时容器
     */
    fun getPublicEntityManager(temporary: Boolean = false): Manager

    /**
     * 获取私有单位管理器
     *
     * @param player 玩家
     * @param temporary 是否为临时容器
     */
    fun getPrivateEntityManager(player: Player, temporary: Boolean = false): Manager

    /**
     * 获取用于检索实体的工具
     */
    fun getEntityFinder(): AdyeshachEntityFinder

    /**
     * 获取用于读取配置文件中的单位的序列化接口
     */
    fun getEntitySerializer(): AdyeshachEntitySerializer

    /**
     * 获取用于处理单位类型的接口
     */
    fun getEntityTypeHandler(): AdyeshachEntityTypeHandler

    /**
     * 获取用于处理单位元数据的接口
     */
    fun getEntityMetadataHandler(): AdyeshachEntityMetadataHandler

    /**
     * 获取用于处理单位控制器的接口
     */
    fun getEntityControllerHandler(): AdyeshachEntityControllerHandler

    /**
     * 获取 Hologram 控制接口
     */
    fun getHologramHandler(): AdyeshachHologramHandler

    /**
     * 获取 Kether 控制接口
     */
    fun getKetherHandler(): AdyeshachKetherHandler

    /**
     * 获取 Adyeshach 中的 NMS 接口
     */
    fun getMinecraftAPI(): AdyeshachMinecraftAPI

    /**
     * 获取 Adyeshach 中的网络接口
     */
    fun getNetworkAPI(): AdyeshachNetworkAPI

    /**
     * 获取 Adyeshach 中的语言文件接口
     */
    fun getLanguage(): AdyeshachLanguage
}