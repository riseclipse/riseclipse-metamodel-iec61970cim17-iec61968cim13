/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pan Pricing Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getAlternateCostDelivered <em>Alternate Cost Delivered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getAlternateCostUnit <em>Alternate Cost Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getCurrentTimeDate <em>Current Time Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getGenerationPrice <em>Generation Price</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getGenerationPriceRatio <em>Generation Price Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getPriceRatio <em>Price Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getPriceTier <em>Price Tier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getPriceTierCount <em>Price Tier Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getPriceTierLabel <em>Price Tier Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getRateLabel <em>Rate Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getRegisterTier <em>Register Tier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PanPricingDetailImpl#getPanPricing <em>Pan Pricing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PanPricingDetailImpl extends CimObjectWithIDImpl implements PanPricingDetail {
    /**
     * The default value of the '{@link #getAlternateCostDelivered() <em>Alternate Cost Delivered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlternateCostDelivered()
     * @generated
     * @ordered
     */
    protected static final Float ALTERNATE_COST_DELIVERED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlternateCostDelivered() <em>Alternate Cost Delivered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlternateCostDelivered()
     * @generated
     * @ordered
     */
    protected Float alternateCostDelivered = ALTERNATE_COST_DELIVERED_EDEFAULT;

    /**
     * This is true if the Alternate Cost Delivered attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean alternateCostDeliveredESet;

    /**
     * The default value of the '{@link #getAlternateCostUnit() <em>Alternate Cost Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlternateCostUnit()
     * @generated
     * @ordered
     */
    protected static final String ALTERNATE_COST_UNIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlternateCostUnit() <em>Alternate Cost Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlternateCostUnit()
     * @generated
     * @ordered
     */
    protected String alternateCostUnit = ALTERNATE_COST_UNIT_EDEFAULT;

    /**
     * This is true if the Alternate Cost Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean alternateCostUnitESet;

    /**
     * The default value of the '{@link #getCurrentTimeDate() <em>Current Time Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentTimeDate()
     * @generated
     * @ordered
     */
    protected static final Date CURRENT_TIME_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrentTimeDate() <em>Current Time Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrentTimeDate()
     * @generated
     * @ordered
     */
    protected Date currentTimeDate = CURRENT_TIME_DATE_EDEFAULT;

    /**
     * This is true if the Current Time Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentTimeDateESet;

    /**
     * The default value of the '{@link #getGenerationPrice() <em>Generation Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenerationPrice()
     * @generated
     * @ordered
     */
    protected static final BigDecimal GENERATION_PRICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGenerationPrice() <em>Generation Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenerationPrice()
     * @generated
     * @ordered
     */
    protected BigDecimal generationPrice = GENERATION_PRICE_EDEFAULT;

    /**
     * This is true if the Generation Price attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean generationPriceESet;

    /**
     * The default value of the '{@link #getGenerationPriceRatio() <em>Generation Price Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenerationPriceRatio()
     * @generated
     * @ordered
     */
    protected static final Float GENERATION_PRICE_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGenerationPriceRatio() <em>Generation Price Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenerationPriceRatio()
     * @generated
     * @ordered
     */
    protected Float generationPriceRatio = GENERATION_PRICE_RATIO_EDEFAULT;

    /**
     * This is true if the Generation Price Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean generationPriceRatioESet;

    /**
     * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrice()
     * @generated
     * @ordered
     */
    protected static final BigDecimal PRICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrice()
     * @generated
     * @ordered
     */
    protected BigDecimal price = PRICE_EDEFAULT;

    /**
     * This is true if the Price attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priceESet;

    /**
     * The default value of the '{@link #getPriceRatio() <em>Price Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceRatio()
     * @generated
     * @ordered
     */
    protected static final Float PRICE_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriceRatio() <em>Price Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceRatio()
     * @generated
     * @ordered
     */
    protected Float priceRatio = PRICE_RATIO_EDEFAULT;

    /**
     * This is true if the Price Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priceRatioESet;

    /**
     * The default value of the '{@link #getPriceTier() <em>Price Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceTier()
     * @generated
     * @ordered
     */
    protected static final Integer PRICE_TIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriceTier() <em>Price Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceTier()
     * @generated
     * @ordered
     */
    protected Integer priceTier = PRICE_TIER_EDEFAULT;

    /**
     * This is true if the Price Tier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priceTierESet;

    /**
     * The default value of the '{@link #getPriceTierCount() <em>Price Tier Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceTierCount()
     * @generated
     * @ordered
     */
    protected static final Integer PRICE_TIER_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriceTierCount() <em>Price Tier Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceTierCount()
     * @generated
     * @ordered
     */
    protected Integer priceTierCount = PRICE_TIER_COUNT_EDEFAULT;

    /**
     * This is true if the Price Tier Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priceTierCountESet;

    /**
     * The default value of the '{@link #getPriceTierLabel() <em>Price Tier Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceTierLabel()
     * @generated
     * @ordered
     */
    protected static final String PRICE_TIER_LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriceTierLabel() <em>Price Tier Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriceTierLabel()
     * @generated
     * @ordered
     */
    protected String priceTierLabel = PRICE_TIER_LABEL_EDEFAULT;

    /**
     * This is true if the Price Tier Label attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priceTierLabelESet;

    /**
     * The default value of the '{@link #getRateLabel() <em>Rate Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRateLabel()
     * @generated
     * @ordered
     */
    protected static final String RATE_LABEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRateLabel() <em>Rate Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRateLabel()
     * @generated
     * @ordered
     */
    protected String rateLabel = RATE_LABEL_EDEFAULT;

    /**
     * This is true if the Rate Label attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rateLabelESet;

    /**
     * The default value of the '{@link #getRegisterTier() <em>Register Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegisterTier()
     * @generated
     * @ordered
     */
    protected static final String REGISTER_TIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRegisterTier() <em>Register Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegisterTier()
     * @generated
     * @ordered
     */
    protected String registerTier = REGISTER_TIER_EDEFAULT;

    /**
     * This is true if the Register Tier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean registerTierESet;

    /**
     * The default value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitOfMeasure()
     * @generated
     * @ordered
     */
    protected static final String UNIT_OF_MEASURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitOfMeasure()
     * @generated
     * @ordered
     */
    protected String unitOfMeasure = UNIT_OF_MEASURE_EDEFAULT;

    /**
     * This is true if the Unit Of Measure attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitOfMeasureESet;

    /**
     * The cached value of the '{@link #getPanPricing() <em>Pan Pricing</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPanPricing()
     * @generated
     * @ordered
     */
    protected PanPricing panPricing;

    /**
     * This is true if the Pan Pricing reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean panPricingESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PanPricingDetailImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPanPricingDetail();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAlternateCostDelivered() {
        return alternateCostDelivered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAlternateCostDelivered( Float newAlternateCostDelivered ) {
        Float oldAlternateCostDelivered = alternateCostDelivered;
        alternateCostDelivered = newAlternateCostDelivered;
        boolean oldAlternateCostDeliveredESet = alternateCostDeliveredESet;
        alternateCostDeliveredESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_DELIVERED,
                        oldAlternateCostDelivered, alternateCostDelivered, !oldAlternateCostDeliveredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAlternateCostDelivered() {
        Float oldAlternateCostDelivered = alternateCostDelivered;
        boolean oldAlternateCostDeliveredESet = alternateCostDeliveredESet;
        alternateCostDelivered = ALTERNATE_COST_DELIVERED_EDEFAULT;
        alternateCostDeliveredESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_DELIVERED, oldAlternateCostDelivered,
                ALTERNATE_COST_DELIVERED_EDEFAULT, oldAlternateCostDeliveredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAlternateCostDelivered() {
        return alternateCostDeliveredESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAlternateCostUnit() {
        return alternateCostUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAlternateCostUnit( String newAlternateCostUnit ) {
        String oldAlternateCostUnit = alternateCostUnit;
        alternateCostUnit = newAlternateCostUnit;
        boolean oldAlternateCostUnitESet = alternateCostUnitESet;
        alternateCostUnitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_UNIT,
                    oldAlternateCostUnit, alternateCostUnit, !oldAlternateCostUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAlternateCostUnit() {
        String oldAlternateCostUnit = alternateCostUnit;
        boolean oldAlternateCostUnitESet = alternateCostUnitESet;
        alternateCostUnit = ALTERNATE_COST_UNIT_EDEFAULT;
        alternateCostUnitESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_UNIT,
                        oldAlternateCostUnit, ALTERNATE_COST_UNIT_EDEFAULT, oldAlternateCostUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAlternateCostUnit() {
        return alternateCostUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCurrentTimeDate() {
        return currentTimeDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrentTimeDate( Date newCurrentTimeDate ) {
        Date oldCurrentTimeDate = currentTimeDate;
        currentTimeDate = newCurrentTimeDate;
        boolean oldCurrentTimeDateESet = currentTimeDateESet;
        currentTimeDateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_PRICING_DETAIL__CURRENT_TIME_DATE,
                    oldCurrentTimeDate, currentTimeDate, !oldCurrentTimeDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrentTimeDate() {
        Date oldCurrentTimeDate = currentTimeDate;
        boolean oldCurrentTimeDateESet = currentTimeDateESet;
        currentTimeDate = CURRENT_TIME_DATE_EDEFAULT;
        currentTimeDateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_PRICING_DETAIL__CURRENT_TIME_DATE,
                    oldCurrentTimeDate, CURRENT_TIME_DATE_EDEFAULT, oldCurrentTimeDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrentTimeDate() {
        return currentTimeDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getGenerationPrice() {
        return generationPrice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenerationPrice( BigDecimal newGenerationPrice ) {
        BigDecimal oldGenerationPrice = generationPrice;
        generationPrice = newGenerationPrice;
        boolean oldGenerationPriceESet = generationPriceESet;
        generationPriceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE,
                    oldGenerationPrice, generationPrice, !oldGenerationPriceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenerationPrice() {
        BigDecimal oldGenerationPrice = generationPrice;
        boolean oldGenerationPriceESet = generationPriceESet;
        generationPrice = GENERATION_PRICE_EDEFAULT;
        generationPriceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE,
                    oldGenerationPrice, GENERATION_PRICE_EDEFAULT, oldGenerationPriceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenerationPrice() {
        return generationPriceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGenerationPriceRatio() {
        return generationPriceRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenerationPriceRatio( Float newGenerationPriceRatio ) {
        Float oldGenerationPriceRatio = generationPriceRatio;
        generationPriceRatio = newGenerationPriceRatio;
        boolean oldGenerationPriceRatioESet = generationPriceRatioESet;
        generationPriceRatioESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE_RATIO,
                        oldGenerationPriceRatio, generationPriceRatio, !oldGenerationPriceRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenerationPriceRatio() {
        Float oldGenerationPriceRatio = generationPriceRatio;
        boolean oldGenerationPriceRatioESet = generationPriceRatioESet;
        generationPriceRatio = GENERATION_PRICE_RATIO_EDEFAULT;
        generationPriceRatioESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE_RATIO,
                        oldGenerationPriceRatio, GENERATION_PRICE_RATIO_EDEFAULT, oldGenerationPriceRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenerationPriceRatio() {
        return generationPriceRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrice( BigDecimal newPrice ) {
        BigDecimal oldPrice = price;
        price = newPrice;
        boolean oldPriceESet = priceESet;
        priceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_PRICING_DETAIL__PRICE, oldPrice, price, !oldPriceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrice() {
        BigDecimal oldPrice = price;
        boolean oldPriceESet = priceESet;
        price = PRICE_EDEFAULT;
        priceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_PRICING_DETAIL__PRICE, oldPrice, PRICE_EDEFAULT, oldPriceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrice() {
        return priceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPriceRatio() {
        return priceRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPriceRatio( Float newPriceRatio ) {
        Float oldPriceRatio = priceRatio;
        priceRatio = newPriceRatio;
        boolean oldPriceRatioESet = priceRatioESet;
        priceRatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_PRICING_DETAIL__PRICE_RATIO, oldPriceRatio, priceRatio, !oldPriceRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPriceRatio() {
        Float oldPriceRatio = priceRatio;
        boolean oldPriceRatioESet = priceRatioESet;
        priceRatio = PRICE_RATIO_EDEFAULT;
        priceRatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_PRICING_DETAIL__PRICE_RATIO, oldPriceRatio, PRICE_RATIO_EDEFAULT, oldPriceRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriceRatio() {
        return priceRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPriceTier() {
        return priceTier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPriceTier( Integer newPriceTier ) {
        Integer oldPriceTier = priceTier;
        priceTier = newPriceTier;
        boolean oldPriceTierESet = priceTierESet;
        priceTierESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_PRICING_DETAIL__PRICE_TIER, oldPriceTier, priceTier, !oldPriceTierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPriceTier() {
        Integer oldPriceTier = priceTier;
        boolean oldPriceTierESet = priceTierESet;
        priceTier = PRICE_TIER_EDEFAULT;
        priceTierESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_PRICING_DETAIL__PRICE_TIER, oldPriceTier, PRICE_TIER_EDEFAULT, oldPriceTierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriceTier() {
        return priceTierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPriceTierCount() {
        return priceTierCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPriceTierCount( Integer newPriceTierCount ) {
        Integer oldPriceTierCount = priceTierCount;
        priceTierCount = newPriceTierCount;
        boolean oldPriceTierCountESet = priceTierCountESet;
        priceTierCountESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_COUNT,
                    oldPriceTierCount, priceTierCount, !oldPriceTierCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPriceTierCount() {
        Integer oldPriceTierCount = priceTierCount;
        boolean oldPriceTierCountESet = priceTierCountESet;
        priceTierCount = PRICE_TIER_COUNT_EDEFAULT;
        priceTierCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_COUNT,
                    oldPriceTierCount, PRICE_TIER_COUNT_EDEFAULT, oldPriceTierCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriceTierCount() {
        return priceTierCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPriceTierLabel() {
        return priceTierLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPriceTierLabel( String newPriceTierLabel ) {
        String oldPriceTierLabel = priceTierLabel;
        priceTierLabel = newPriceTierLabel;
        boolean oldPriceTierLabelESet = priceTierLabelESet;
        priceTierLabelESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_LABEL,
                    oldPriceTierLabel, priceTierLabel, !oldPriceTierLabelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPriceTierLabel() {
        String oldPriceTierLabel = priceTierLabel;
        boolean oldPriceTierLabelESet = priceTierLabelESet;
        priceTierLabel = PRICE_TIER_LABEL_EDEFAULT;
        priceTierLabelESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_LABEL,
                    oldPriceTierLabel, PRICE_TIER_LABEL_EDEFAULT, oldPriceTierLabelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriceTierLabel() {
        return priceTierLabelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRateLabel() {
        return rateLabel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRateLabel( String newRateLabel ) {
        String oldRateLabel = rateLabel;
        rateLabel = newRateLabel;
        boolean oldRateLabelESet = rateLabelESet;
        rateLabelESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_PRICING_DETAIL__RATE_LABEL, oldRateLabel, rateLabel, !oldRateLabelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRateLabel() {
        String oldRateLabel = rateLabel;
        boolean oldRateLabelESet = rateLabelESet;
        rateLabel = RATE_LABEL_EDEFAULT;
        rateLabelESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PAN_PRICING_DETAIL__RATE_LABEL, oldRateLabel, RATE_LABEL_EDEFAULT, oldRateLabelESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRateLabel() {
        return rateLabelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRegisterTier() {
        return registerTier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRegisterTier( String newRegisterTier ) {
        String oldRegisterTier = registerTier;
        registerTier = newRegisterTier;
        boolean oldRegisterTierESet = registerTierESet;
        registerTierESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PAN_PRICING_DETAIL__REGISTER_TIER, oldRegisterTier, registerTier, !oldRegisterTierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRegisterTier() {
        String oldRegisterTier = registerTier;
        boolean oldRegisterTierESet = registerTierESet;
        registerTier = REGISTER_TIER_EDEFAULT;
        registerTierESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_PRICING_DETAIL__REGISTER_TIER,
                    oldRegisterTier, REGISTER_TIER_EDEFAULT, oldRegisterTierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegisterTier() {
        return registerTierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitOfMeasure( String newUnitOfMeasure ) {
        String oldUnitOfMeasure = unitOfMeasure;
        unitOfMeasure = newUnitOfMeasure;
        boolean oldUnitOfMeasureESet = unitOfMeasureESet;
        unitOfMeasureESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PAN_PRICING_DETAIL__UNIT_OF_MEASURE,
                    oldUnitOfMeasure, unitOfMeasure, !oldUnitOfMeasureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitOfMeasure() {
        String oldUnitOfMeasure = unitOfMeasure;
        boolean oldUnitOfMeasureESet = unitOfMeasureESet;
        unitOfMeasure = UNIT_OF_MEASURE_EDEFAULT;
        unitOfMeasureESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PAN_PRICING_DETAIL__UNIT_OF_MEASURE,
                    oldUnitOfMeasure, UNIT_OF_MEASURE_EDEFAULT, oldUnitOfMeasureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitOfMeasure() {
        return unitOfMeasureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PanPricing getPanPricing() {
        return panPricing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPanPricing( PanPricing newPanPricing, NotificationChain msgs ) {
        PanPricing oldPanPricing = panPricing;
        panPricing = newPanPricing;
        boolean oldPanPricingESet = panPricingESet;
        panPricingESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PAN_PRICING_DETAIL__PAN_PRICING, oldPanPricing, newPanPricing, !oldPanPricingESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPanPricing( PanPricing newPanPricing ) {
        if( newPanPricing != panPricing ) {
            NotificationChain msgs = null;
            if( panPricing != null ) msgs = ( ( InternalEObject ) panPricing ).eInverseRemove( this,
                    CimPackage.PAN_PRICING__PAN_PRICING_DETAILS, PanPricing.class, msgs );
            if( newPanPricing != null ) msgs = ( ( InternalEObject ) newPanPricing ).eInverseAdd( this,
                    CimPackage.PAN_PRICING__PAN_PRICING_DETAILS, PanPricing.class, msgs );
            msgs = basicSetPanPricing( newPanPricing, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPanPricingESet = panPricingESet;
            panPricingESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PAN_PRICING_DETAIL__PAN_PRICING, newPanPricing, newPanPricing, !oldPanPricingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPanPricing( NotificationChain msgs ) {
        PanPricing oldPanPricing = panPricing;
        panPricing = null;
        boolean oldPanPricingESet = panPricingESet;
        panPricingESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PAN_PRICING_DETAIL__PAN_PRICING, oldPanPricing, null, oldPanPricingESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPanPricing() {
        if( panPricing != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) panPricing ).eInverseRemove( this, CimPackage.PAN_PRICING__PAN_PRICING_DETAILS,
                    PanPricing.class, msgs );
            msgs = basicUnsetPanPricing( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPanPricingESet = panPricingESet;
            panPricingESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PAN_PRICING_DETAIL__PAN_PRICING, null, null, oldPanPricingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPanPricing() {
        return panPricingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PAN_PRICING_DETAIL__PAN_PRICING:
            if( panPricing != null ) msgs = ( ( InternalEObject ) panPricing ).eInverseRemove( this,
                    CimPackage.PAN_PRICING__PAN_PRICING_DETAILS, PanPricing.class, msgs );
            return basicSetPanPricing( ( PanPricing ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PAN_PRICING_DETAIL__PAN_PRICING:
            return basicUnsetPanPricing( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_DELIVERED:
            return getAlternateCostDelivered();
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_UNIT:
            return getAlternateCostUnit();
        case CimPackage.PAN_PRICING_DETAIL__CURRENT_TIME_DATE:
            return getCurrentTimeDate();
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE:
            return getGenerationPrice();
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE_RATIO:
            return getGenerationPriceRatio();
        case CimPackage.PAN_PRICING_DETAIL__PRICE:
            return getPrice();
        case CimPackage.PAN_PRICING_DETAIL__PRICE_RATIO:
            return getPriceRatio();
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER:
            return getPriceTier();
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_COUNT:
            return getPriceTierCount();
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_LABEL:
            return getPriceTierLabel();
        case CimPackage.PAN_PRICING_DETAIL__RATE_LABEL:
            return getRateLabel();
        case CimPackage.PAN_PRICING_DETAIL__REGISTER_TIER:
            return getRegisterTier();
        case CimPackage.PAN_PRICING_DETAIL__UNIT_OF_MEASURE:
            return getUnitOfMeasure();
        case CimPackage.PAN_PRICING_DETAIL__PAN_PRICING:
            return getPanPricing();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_DELIVERED:
            setAlternateCostDelivered( ( Float ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_UNIT:
            setAlternateCostUnit( ( String ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__CURRENT_TIME_DATE:
            setCurrentTimeDate( ( Date ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE:
            setGenerationPrice( ( BigDecimal ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE_RATIO:
            setGenerationPriceRatio( ( Float ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE:
            setPrice( ( BigDecimal ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE_RATIO:
            setPriceRatio( ( Float ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER:
            setPriceTier( ( Integer ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_COUNT:
            setPriceTierCount( ( Integer ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_LABEL:
            setPriceTierLabel( ( String ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__RATE_LABEL:
            setRateLabel( ( String ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__REGISTER_TIER:
            setRegisterTier( ( String ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__UNIT_OF_MEASURE:
            setUnitOfMeasure( ( String ) newValue );
            return;
        case CimPackage.PAN_PRICING_DETAIL__PAN_PRICING:
            setPanPricing( ( PanPricing ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_DELIVERED:
            unsetAlternateCostDelivered();
            return;
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_UNIT:
            unsetAlternateCostUnit();
            return;
        case CimPackage.PAN_PRICING_DETAIL__CURRENT_TIME_DATE:
            unsetCurrentTimeDate();
            return;
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE:
            unsetGenerationPrice();
            return;
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE_RATIO:
            unsetGenerationPriceRatio();
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE:
            unsetPrice();
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE_RATIO:
            unsetPriceRatio();
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER:
            unsetPriceTier();
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_COUNT:
            unsetPriceTierCount();
            return;
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_LABEL:
            unsetPriceTierLabel();
            return;
        case CimPackage.PAN_PRICING_DETAIL__RATE_LABEL:
            unsetRateLabel();
            return;
        case CimPackage.PAN_PRICING_DETAIL__REGISTER_TIER:
            unsetRegisterTier();
            return;
        case CimPackage.PAN_PRICING_DETAIL__UNIT_OF_MEASURE:
            unsetUnitOfMeasure();
            return;
        case CimPackage.PAN_PRICING_DETAIL__PAN_PRICING:
            unsetPanPricing();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_DELIVERED:
            return isSetAlternateCostDelivered();
        case CimPackage.PAN_PRICING_DETAIL__ALTERNATE_COST_UNIT:
            return isSetAlternateCostUnit();
        case CimPackage.PAN_PRICING_DETAIL__CURRENT_TIME_DATE:
            return isSetCurrentTimeDate();
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE:
            return isSetGenerationPrice();
        case CimPackage.PAN_PRICING_DETAIL__GENERATION_PRICE_RATIO:
            return isSetGenerationPriceRatio();
        case CimPackage.PAN_PRICING_DETAIL__PRICE:
            return isSetPrice();
        case CimPackage.PAN_PRICING_DETAIL__PRICE_RATIO:
            return isSetPriceRatio();
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER:
            return isSetPriceTier();
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_COUNT:
            return isSetPriceTierCount();
        case CimPackage.PAN_PRICING_DETAIL__PRICE_TIER_LABEL:
            return isSetPriceTierLabel();
        case CimPackage.PAN_PRICING_DETAIL__RATE_LABEL:
            return isSetRateLabel();
        case CimPackage.PAN_PRICING_DETAIL__REGISTER_TIER:
            return isSetRegisterTier();
        case CimPackage.PAN_PRICING_DETAIL__UNIT_OF_MEASURE:
            return isSetUnitOfMeasure();
        case CimPackage.PAN_PRICING_DETAIL__PAN_PRICING:
            return isSetPanPricing();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (alternateCostDelivered: " );
        if( alternateCostDeliveredESet )
            result.append( alternateCostDelivered );
        else
            result.append( "<unset>" );
        result.append( ", alternateCostUnit: " );
        if( alternateCostUnitESet )
            result.append( alternateCostUnit );
        else
            result.append( "<unset>" );
        result.append( ", currentTimeDate: " );
        if( currentTimeDateESet )
            result.append( currentTimeDate );
        else
            result.append( "<unset>" );
        result.append( ", generationPrice: " );
        if( generationPriceESet )
            result.append( generationPrice );
        else
            result.append( "<unset>" );
        result.append( ", generationPriceRatio: " );
        if( generationPriceRatioESet )
            result.append( generationPriceRatio );
        else
            result.append( "<unset>" );
        result.append( ", price: " );
        if( priceESet )
            result.append( price );
        else
            result.append( "<unset>" );
        result.append( ", priceRatio: " );
        if( priceRatioESet )
            result.append( priceRatio );
        else
            result.append( "<unset>" );
        result.append( ", priceTier: " );
        if( priceTierESet )
            result.append( priceTier );
        else
            result.append( "<unset>" );
        result.append( ", priceTierCount: " );
        if( priceTierCountESet )
            result.append( priceTierCount );
        else
            result.append( "<unset>" );
        result.append( ", priceTierLabel: " );
        if( priceTierLabelESet )
            result.append( priceTierLabel );
        else
            result.append( "<unset>" );
        result.append( ", rateLabel: " );
        if( rateLabelESet )
            result.append( rateLabel );
        else
            result.append( "<unset>" );
        result.append( ", registerTier: " );
        if( registerTierESet )
            result.append( registerTier );
        else
            result.append( "<unset>" );
        result.append( ", unitOfMeasure: " );
        if( unitOfMeasureESet )
            result.append( unitOfMeasure );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PanPricingDetailImpl
