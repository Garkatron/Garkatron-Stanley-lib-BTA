package deus.stanleylib.mixin;

import deus.stanleylib.config.IStanleySettings;
import net.minecraft.client.option.BooleanOption;
import net.minecraft.client.option.FloatOption;
import net.minecraft.client.option.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value = GameSettings.class, remap = false)
public class MixinGameSettings implements IStanleySettings {

	private final GameSettings mixinInst = (GameSettings) ((Object) this);

	@Unique
	public BooleanOption initialRunSetupFinished =
		new BooleanOption(mixinInst, "stanleylib.options.initialRunSetupFinished", false);


	@Unique
	private final BooleanOption activateManagement = new BooleanOption(mixinInst, "stanleylib.options.activateManagement", false);

	@Unique
	private final FloatOption overHeatingTemperature = new FloatOption(mixinInst, "stanleylib.options.overHeatingTemperature", 60.0f);
	@Unique
	private final FloatOption hotTemperature = new FloatOption(mixinInst, "stanleylib.options.hotTemperature", 45.0f);
	@Unique
	private final FloatOption defaultTemperature = new FloatOption(mixinInst, "stanleylib.options.defaultTemperature", 36.5f);
	@Unique
	private final FloatOption coldTemperature = new FloatOption(mixinInst, "stanleylib.options.coldTemperature", -15.0f);
	@Unique
	private final FloatOption freezingTemperature = new FloatOption(mixinInst, "stanleylib.options.freezingTemperature", -30.0f);

	@Unique
	private final BooleanOption weatherAffectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.weatherAffectsTemperature", false);
	@Unique
	private final FloatOption overworldRain = new FloatOption(mixinInst, "stanleylib.options.overworldRain", -0.1f);
	@Unique
	private final FloatOption overworldSnow = new FloatOption(mixinInst, "stanleylib.options.overworldSnow", -0.2f);
	@Unique
	private final FloatOption overworldStorm = new FloatOption(mixinInst, "stanleylib.options.overworldStorm", -0.1f);
	@Unique
	private final FloatOption overworldWinterSnow = new FloatOption(mixinInst, "stanleylib.options.overworldWinterSnow", -0.3f);

	@Unique
	private final BooleanOption itemAffectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.itemAffectsTemperature", false);
	@Unique
	private final FloatOption torch = new FloatOption(mixinInst, "stanleylib.options.torch", 0.8f);
	@Unique
	private final FloatOption redstoneTorch = new FloatOption(mixinInst, "stanleylib.options.redstoneTorch", 0.5f);
	@Unique
	private final FloatOption lavaBucket = new FloatOption(mixinInst, "stanleylib.options.lavaBucket", 0.25f);
	@Unique
	private final FloatOption netherCoal = new FloatOption(mixinInst, "stanleylib.options.netherCoal", 0.25f);
	@Unique
	private final FloatOption iceCream = new FloatOption(mixinInst, "stanleylib.options.iceCream", -0.05f);

	@Unique
	private final BooleanOption foodAffectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.foodAffectsTemperature", false);
	@Unique
	private final FloatOption soup = new FloatOption(mixinInst, "stanleylib.options.soup", 0.8f);
	@Unique
	private final FloatOption milk = new FloatOption(mixinInst, "stanleylib.options.milk", -0.5f);

	@Unique
	private final BooleanOption lifeAffectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.lifeAffectsTemperature", false);
	@Unique
	private final FloatOption lowLifePenalization = new FloatOption(mixinInst, "stanleylib.options.lowLifePenalization", 2.0f);
	@Unique
	private final FloatOption heightLifeAdvantage = new FloatOption(mixinInst, "stanleylib.options.heightLifeAdvantage", 2.0f);

	@Unique
	private final BooleanOption playerOverBlockAffectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.playerOverBlockAffectsTemperature", false);
	@Unique
	private final FloatOption snowBlock = new FloatOption(mixinInst, "stanleylib.options.snowBlock", -0.05f);
	@Unique
	private final FloatOption waterBlock = new FloatOption(mixinInst, "stanleylib.options.waterBlock", -0.05f);
	@Unique
	private final FloatOption iceBlock = new FloatOption(mixinInst, "stanleylib.options.iceBlock", -0.03f);

	@Unique
	private final BooleanOption snowballAffectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.snowballAffectsTemperature", false);
	@Unique
	private final FloatOption snowballEffect = new FloatOption(mixinInst, "stanleylib.options.snowballEffect", 0.01f);

	@Unique
	private final BooleanOption biomeAffectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.biomeAffectsTemperature", false);
	@Unique
	private final FloatOption plains = new FloatOption(mixinInst, "stanleylib.options.plains", 0.0f);
	@Unique
	private final FloatOption taiga = new FloatOption(mixinInst, "stanleylib.options.taiga", -0.1f);
	@Unique
	private final FloatOption nether = new FloatOption(mixinInst, "stanleylib.options.nether", 5.0f);
	@Unique
	private final FloatOption birchForest = new FloatOption(mixinInst, "stanleylib.options.birchForest", 0.0f);
	@Unique
	private final FloatOption caatinga = new FloatOption(mixinInst, "stanleylib.options.caatinga", -0.01f);
	@Unique
	private final FloatOption borealForest = new FloatOption(mixinInst, "stanleylib.options.borealForest", 0.0f);
	@Unique
	private final FloatOption swampLand = new FloatOption(mixinInst, "stanleylib.options.swampLand", -1.0f);
	@Unique
	private final FloatOption desert = new FloatOption(mixinInst, "stanleylib.options.desert", 2.0f);
	@Unique
	private final FloatOption forest = new FloatOption(mixinInst, "stanleylib.options.forest", -0.015f);

	@Unique
	private final BooleanOption leatherProtectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.leatherProtectsTemperature", false);
	@Unique
	private final FloatOption leatherProtectionPercentage = new FloatOption(mixinInst, "stanleylib.options.leatherProtectionPercentage", 0.01f);

	@Unique
	private final BooleanOption seasonAffectsTemperature = new BooleanOption(mixinInst, "stanleylib.options.seasonAffectsTemperature", false);
	@Unique
	private final FloatOption summerTemperature = new FloatOption(mixinInst, "stanleylib.options.summerTemperature", 0.04f);
	@Unique
	private final FloatOption fallTemperature = new FloatOption(mixinInst, "stanleylib.options.fallTemperature", 0.0f);
	@Unique
	private final FloatOption winterTemperature = new FloatOption(mixinInst, "stanleylib.options.winterTemperature", -0.05f);
	@Unique
	private final FloatOption springTemperature = new FloatOption(mixinInst, "stanleylib.options.springTemperature", 0.0f);

	@Override
	public BooleanOption initialRunSetupFinished() {
		return initialRunSetupFinished;
	}

	@Override
	public BooleanOption stanley_lib_BTA$activateManagement() {
		return activateManagement;
	}

	@Override
	public FloatOption stanley_lib_BTA$overHeatingTemperature() {
		return overHeatingTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$hotTemperature() {
		return hotTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$defaultTemperature() {
		return defaultTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$coldTemperature() {
		return coldTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$freezingTemperature() {
		return freezingTemperature;
	}

	@Override
	public BooleanOption stanley_lib_BTA$weatherAffectsTemperature() {
		return weatherAffectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$overworldRain() {
		return overworldRain;
	}

	@Override
	public FloatOption stanley_lib_BTA$overworldSnow() {
		return overworldSnow;
	}

	@Override
	public FloatOption stanley_lib_BTA$overworldStorm() {
		return overworldStorm;
	}

	@Override
	public FloatOption stanley_lib_BTA$overworldWinterSnow() {
		return overworldWinterSnow;
	}

	@Override
	public BooleanOption stanley_lib_BTA$itemAffectsTemperature() {
		return itemAffectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$torch() {
		return torch;
	}

	@Override
	public FloatOption stanley_lib_BTA$redstoneTorch() {
		return redstoneTorch;
	}

	@Override
	public FloatOption stanley_lib_BTA$lavaBucket() {
		return lavaBucket;
	}

	@Override
	public FloatOption stanley_lib_BTA$netherCoal() {
		return netherCoal;
	}

	@Override
	public FloatOption stanley_lib_BTA$iceCream() {
		return iceCream;
	}

	@Override
	public BooleanOption stanley_lib_BTA$foodAffectsTemperature() {
		return foodAffectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$soup() {
		return soup;
	}

	@Override
	public FloatOption stanley_lib_BTA$milk() {
		return milk;
	}

	@Override
	public BooleanOption stanley_lib_BTA$lifeAffectsTemperature() {
		return lifeAffectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$lowLifePenalization() {
		return lowLifePenalization;
	}

	@Override
	public FloatOption stanley_lib_BTA$heightLifeAdvantage() {
		return heightLifeAdvantage;
	}

	@Override
	public BooleanOption stanley_lib_BTA$playerOverBlockAffectsTemperature() {
		return playerOverBlockAffectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$snowBlock() {
		return snowBlock;
	}

	@Override
	public FloatOption stanley_lib_BTA$waterBlock() {
		return waterBlock;
	}

	@Override
	public FloatOption stanley_lib_BTA$iceBlock() {
		return iceBlock;
	}

	@Override
	public BooleanOption stanley_lib_BTA$snowballAffectsTemperature() {
		return snowballAffectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$snowballEffect() {
		return snowballEffect;
	}

	@Override
	public BooleanOption stanley_lib_BTA$biomeAffectsTemperature() {
		return biomeAffectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$plains() {
		return plains;
	}

	@Override
	public FloatOption stanley_lib_BTA$taiga() {
		return taiga;
	}

	@Override
	public FloatOption stanley_lib_BTA$nether() {
		return nether;
	}

	@Override
	public FloatOption stanley_lib_BTA$birchForest() {
		return birchForest;
	}

	@Override
	public FloatOption stanley_lib_BTA$caatinga() {
		return caatinga;
	}

	@Override
	public FloatOption stanley_lib_BTA$borealForest() {
		return borealForest;
	}

	@Override
	public FloatOption stanley_lib_BTA$swampLand() {
		return swampLand;
	}

	@Override
	public FloatOption stanley_lib_BTA$desert() {
		return desert;
	}

	@Override
	public FloatOption stanley_lib_BTA$forest() {
		return forest;
	}

	@Override
	public BooleanOption stanley_lib_BTA$leatherProtectsTemperature() {
		return leatherProtectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$leatherProtectionPercentage() {
		return leatherProtectionPercentage;
	}

	@Override
	public BooleanOption stanley_lib_BTA$seasonAffectsTemperature() {
		return seasonAffectsTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$summerTemperature() {
		return summerTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$fallTemperature() {
		return fallTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$winterTemperature() {
		return winterTemperature;
	}

	@Override
	public FloatOption stanley_lib_BTA$springTemperature() {
		return springTemperature;
	}
}
