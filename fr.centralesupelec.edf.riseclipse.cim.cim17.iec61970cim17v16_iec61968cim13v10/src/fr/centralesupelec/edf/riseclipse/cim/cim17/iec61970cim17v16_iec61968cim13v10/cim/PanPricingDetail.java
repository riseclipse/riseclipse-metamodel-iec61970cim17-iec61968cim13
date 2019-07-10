/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.math.BigDecimal;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pan Pricing Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getAlternateCostDelivered <em>Alternate Cost Delivered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getAlternateCostUnit <em>Alternate Cost Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getCurrentTimeDate <em>Current Time Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getGenerationPrice <em>Generation Price</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getGenerationPriceRatio <em>Generation Price Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPrice <em>Price</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceRatio <em>Price Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTier <em>Price Tier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTierCount <em>Price Tier Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTierLabel <em>Price Tier Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getRateLabel <em>Rate Label</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getRegisterTier <em>Register Tier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPanPricing <em>Pan Pricing</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail()
 * @model
 * @generated
 */
public interface PanPricingDetail extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Alternate Cost Delivered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alternate Cost Delivered</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alternate Cost Delivered</em>' attribute.
     * @see #isSetAlternateCostDelivered()
     * @see #unsetAlternateCostDelivered()
     * @see #setAlternateCostDelivered(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_AlternateCostDelivered()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.alternateCostDelivered' kind='element'"
     * @generated
     */
    Float getAlternateCostDelivered();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getAlternateCostDelivered <em>Alternate Cost Delivered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alternate Cost Delivered</em>' attribute.
     * @see #isSetAlternateCostDelivered()
     * @see #unsetAlternateCostDelivered()
     * @see #getAlternateCostDelivered()
     * @generated
     */
    void setAlternateCostDelivered( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getAlternateCostDelivered <em>Alternate Cost Delivered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAlternateCostDelivered()
     * @see #getAlternateCostDelivered()
     * @see #setAlternateCostDelivered(Float)
     * @generated
     */
    void unsetAlternateCostDelivered();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getAlternateCostDelivered <em>Alternate Cost Delivered</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alternate Cost Delivered</em>' attribute is set.
     * @see #unsetAlternateCostDelivered()
     * @see #getAlternateCostDelivered()
     * @see #setAlternateCostDelivered(Float)
     * @generated
     */
    boolean isSetAlternateCostDelivered();

    /**
     * Returns the value of the '<em><b>Alternate Cost Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alternate Cost Unit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alternate Cost Unit</em>' attribute.
     * @see #isSetAlternateCostUnit()
     * @see #unsetAlternateCostUnit()
     * @see #setAlternateCostUnit(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_AlternateCostUnit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.alternateCostUnit' kind='element'"
     * @generated
     */
    String getAlternateCostUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getAlternateCostUnit <em>Alternate Cost Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alternate Cost Unit</em>' attribute.
     * @see #isSetAlternateCostUnit()
     * @see #unsetAlternateCostUnit()
     * @see #getAlternateCostUnit()
     * @generated
     */
    void setAlternateCostUnit( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getAlternateCostUnit <em>Alternate Cost Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAlternateCostUnit()
     * @see #getAlternateCostUnit()
     * @see #setAlternateCostUnit(String)
     * @generated
     */
    void unsetAlternateCostUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getAlternateCostUnit <em>Alternate Cost Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alternate Cost Unit</em>' attribute is set.
     * @see #unsetAlternateCostUnit()
     * @see #getAlternateCostUnit()
     * @see #setAlternateCostUnit(String)
     * @generated
     */
    boolean isSetAlternateCostUnit();

    /**
     * Returns the value of the '<em><b>Current Time Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Time Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Time Date</em>' attribute.
     * @see #isSetCurrentTimeDate()
     * @see #unsetCurrentTimeDate()
     * @see #setCurrentTimeDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_CurrentTimeDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.currentTimeDate' kind='element'"
     * @generated
     */
    Date getCurrentTimeDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getCurrentTimeDate <em>Current Time Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Time Date</em>' attribute.
     * @see #isSetCurrentTimeDate()
     * @see #unsetCurrentTimeDate()
     * @see #getCurrentTimeDate()
     * @generated
     */
    void setCurrentTimeDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getCurrentTimeDate <em>Current Time Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurrentTimeDate()
     * @see #getCurrentTimeDate()
     * @see #setCurrentTimeDate(Date)
     * @generated
     */
    void unsetCurrentTimeDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getCurrentTimeDate <em>Current Time Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Current Time Date</em>' attribute is set.
     * @see #unsetCurrentTimeDate()
     * @see #getCurrentTimeDate()
     * @see #setCurrentTimeDate(Date)
     * @generated
     */
    boolean isSetCurrentTimeDate();

    /**
     * Returns the value of the '<em><b>Generation Price</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generation Price</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generation Price</em>' attribute.
     * @see #isSetGenerationPrice()
     * @see #unsetGenerationPrice()
     * @see #setGenerationPrice(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_GenerationPrice()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.generationPrice' kind='element'"
     * @generated
     */
    BigDecimal getGenerationPrice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getGenerationPrice <em>Generation Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generation Price</em>' attribute.
     * @see #isSetGenerationPrice()
     * @see #unsetGenerationPrice()
     * @see #getGenerationPrice()
     * @generated
     */
    void setGenerationPrice( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getGenerationPrice <em>Generation Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenerationPrice()
     * @see #getGenerationPrice()
     * @see #setGenerationPrice(BigDecimal)
     * @generated
     */
    void unsetGenerationPrice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getGenerationPrice <em>Generation Price</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generation Price</em>' attribute is set.
     * @see #unsetGenerationPrice()
     * @see #getGenerationPrice()
     * @see #setGenerationPrice(BigDecimal)
     * @generated
     */
    boolean isSetGenerationPrice();

    /**
     * Returns the value of the '<em><b>Generation Price Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generation Price Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generation Price Ratio</em>' attribute.
     * @see #isSetGenerationPriceRatio()
     * @see #unsetGenerationPriceRatio()
     * @see #setGenerationPriceRatio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_GenerationPriceRatio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.generationPriceRatio' kind='element'"
     * @generated
     */
    Float getGenerationPriceRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getGenerationPriceRatio <em>Generation Price Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generation Price Ratio</em>' attribute.
     * @see #isSetGenerationPriceRatio()
     * @see #unsetGenerationPriceRatio()
     * @see #getGenerationPriceRatio()
     * @generated
     */
    void setGenerationPriceRatio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getGenerationPriceRatio <em>Generation Price Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenerationPriceRatio()
     * @see #getGenerationPriceRatio()
     * @see #setGenerationPriceRatio(Float)
     * @generated
     */
    void unsetGenerationPriceRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getGenerationPriceRatio <em>Generation Price Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generation Price Ratio</em>' attribute is set.
     * @see #unsetGenerationPriceRatio()
     * @see #getGenerationPriceRatio()
     * @see #setGenerationPriceRatio(Float)
     * @generated
     */
    boolean isSetGenerationPriceRatio();

    /**
     * Returns the value of the '<em><b>Price</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Price</em>' attribute.
     * @see #isSetPrice()
     * @see #unsetPrice()
     * @see #setPrice(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_Price()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.price' kind='element'"
     * @generated
     */
    BigDecimal getPrice();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPrice <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Price</em>' attribute.
     * @see #isSetPrice()
     * @see #unsetPrice()
     * @see #getPrice()
     * @generated
     */
    void setPrice( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPrice <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrice()
     * @see #getPrice()
     * @see #setPrice(BigDecimal)
     * @generated
     */
    void unsetPrice();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPrice <em>Price</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Price</em>' attribute is set.
     * @see #unsetPrice()
     * @see #getPrice()
     * @see #setPrice(BigDecimal)
     * @generated
     */
    boolean isSetPrice();

    /**
     * Returns the value of the '<em><b>Price Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price Ratio</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Price Ratio</em>' attribute.
     * @see #isSetPriceRatio()
     * @see #unsetPriceRatio()
     * @see #setPriceRatio(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_PriceRatio()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.priceRatio' kind='element'"
     * @generated
     */
    Float getPriceRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceRatio <em>Price Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Price Ratio</em>' attribute.
     * @see #isSetPriceRatio()
     * @see #unsetPriceRatio()
     * @see #getPriceRatio()
     * @generated
     */
    void setPriceRatio( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceRatio <em>Price Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriceRatio()
     * @see #getPriceRatio()
     * @see #setPriceRatio(Float)
     * @generated
     */
    void unsetPriceRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceRatio <em>Price Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Price Ratio</em>' attribute is set.
     * @see #unsetPriceRatio()
     * @see #getPriceRatio()
     * @see #setPriceRatio(Float)
     * @generated
     */
    boolean isSetPriceRatio();

    /**
     * Returns the value of the '<em><b>Price Tier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price Tier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Price Tier</em>' attribute.
     * @see #isSetPriceTier()
     * @see #unsetPriceTier()
     * @see #setPriceTier(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_PriceTier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.priceTier' kind='element'"
     * @generated
     */
    Integer getPriceTier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTier <em>Price Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Price Tier</em>' attribute.
     * @see #isSetPriceTier()
     * @see #unsetPriceTier()
     * @see #getPriceTier()
     * @generated
     */
    void setPriceTier( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTier <em>Price Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriceTier()
     * @see #getPriceTier()
     * @see #setPriceTier(Integer)
     * @generated
     */
    void unsetPriceTier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTier <em>Price Tier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Price Tier</em>' attribute is set.
     * @see #unsetPriceTier()
     * @see #getPriceTier()
     * @see #setPriceTier(Integer)
     * @generated
     */
    boolean isSetPriceTier();

    /**
     * Returns the value of the '<em><b>Price Tier Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price Tier Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Price Tier Count</em>' attribute.
     * @see #isSetPriceTierCount()
     * @see #unsetPriceTierCount()
     * @see #setPriceTierCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_PriceTierCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.priceTierCount' kind='element'"
     * @generated
     */
    Integer getPriceTierCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTierCount <em>Price Tier Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Price Tier Count</em>' attribute.
     * @see #isSetPriceTierCount()
     * @see #unsetPriceTierCount()
     * @see #getPriceTierCount()
     * @generated
     */
    void setPriceTierCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTierCount <em>Price Tier Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriceTierCount()
     * @see #getPriceTierCount()
     * @see #setPriceTierCount(Integer)
     * @generated
     */
    void unsetPriceTierCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTierCount <em>Price Tier Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Price Tier Count</em>' attribute is set.
     * @see #unsetPriceTierCount()
     * @see #getPriceTierCount()
     * @see #setPriceTierCount(Integer)
     * @generated
     */
    boolean isSetPriceTierCount();

    /**
     * Returns the value of the '<em><b>Price Tier Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price Tier Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Price Tier Label</em>' attribute.
     * @see #isSetPriceTierLabel()
     * @see #unsetPriceTierLabel()
     * @see #setPriceTierLabel(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_PriceTierLabel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.priceTierLabel' kind='element'"
     * @generated
     */
    String getPriceTierLabel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTierLabel <em>Price Tier Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Price Tier Label</em>' attribute.
     * @see #isSetPriceTierLabel()
     * @see #unsetPriceTierLabel()
     * @see #getPriceTierLabel()
     * @generated
     */
    void setPriceTierLabel( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTierLabel <em>Price Tier Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriceTierLabel()
     * @see #getPriceTierLabel()
     * @see #setPriceTierLabel(String)
     * @generated
     */
    void unsetPriceTierLabel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPriceTierLabel <em>Price Tier Label</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Price Tier Label</em>' attribute is set.
     * @see #unsetPriceTierLabel()
     * @see #getPriceTierLabel()
     * @see #setPriceTierLabel(String)
     * @generated
     */
    boolean isSetPriceTierLabel();

    /**
     * Returns the value of the '<em><b>Rate Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rate Label</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rate Label</em>' attribute.
     * @see #isSetRateLabel()
     * @see #unsetRateLabel()
     * @see #setRateLabel(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_RateLabel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.rateLabel' kind='element'"
     * @generated
     */
    String getRateLabel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getRateLabel <em>Rate Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rate Label</em>' attribute.
     * @see #isSetRateLabel()
     * @see #unsetRateLabel()
     * @see #getRateLabel()
     * @generated
     */
    void setRateLabel( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getRateLabel <em>Rate Label</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRateLabel()
     * @see #getRateLabel()
     * @see #setRateLabel(String)
     * @generated
     */
    void unsetRateLabel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getRateLabel <em>Rate Label</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rate Label</em>' attribute is set.
     * @see #unsetRateLabel()
     * @see #getRateLabel()
     * @see #setRateLabel(String)
     * @generated
     */
    boolean isSetRateLabel();

    /**
     * Returns the value of the '<em><b>Register Tier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Register Tier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Register Tier</em>' attribute.
     * @see #isSetRegisterTier()
     * @see #unsetRegisterTier()
     * @see #setRegisterTier(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_RegisterTier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.registerTier' kind='element'"
     * @generated
     */
    String getRegisterTier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getRegisterTier <em>Register Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Register Tier</em>' attribute.
     * @see #isSetRegisterTier()
     * @see #unsetRegisterTier()
     * @see #getRegisterTier()
     * @generated
     */
    void setRegisterTier( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getRegisterTier <em>Register Tier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegisterTier()
     * @see #getRegisterTier()
     * @see #setRegisterTier(String)
     * @generated
     */
    void unsetRegisterTier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getRegisterTier <em>Register Tier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Register Tier</em>' attribute is set.
     * @see #unsetRegisterTier()
     * @see #getRegisterTier()
     * @see #setRegisterTier(String)
     * @generated
     */
    boolean isSetRegisterTier();

    /**
     * Returns the value of the '<em><b>Unit Of Measure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit Of Measure</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit Of Measure</em>' attribute.
     * @see #isSetUnitOfMeasure()
     * @see #unsetUnitOfMeasure()
     * @see #setUnitOfMeasure(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_UnitOfMeasure()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.unitOfMeasure' kind='element'"
     * @generated
     */
    String getUnitOfMeasure();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit Of Measure</em>' attribute.
     * @see #isSetUnitOfMeasure()
     * @see #unsetUnitOfMeasure()
     * @see #getUnitOfMeasure()
     * @generated
     */
    void setUnitOfMeasure( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitOfMeasure()
     * @see #getUnitOfMeasure()
     * @see #setUnitOfMeasure(String)
     * @generated
     */
    void unsetUnitOfMeasure();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getUnitOfMeasure <em>Unit Of Measure</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit Of Measure</em>' attribute is set.
     * @see #unsetUnitOfMeasure()
     * @see #getUnitOfMeasure()
     * @see #setUnitOfMeasure(String)
     * @generated
     */
    boolean isSetUnitOfMeasure();

    /**
     * Returns the value of the '<em><b>Pan Pricing</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getPanPricingDetails <em>Pan Pricing Details</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pan Pricing</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pan Pricing</em>' reference.
     * @see #isSetPanPricing()
     * @see #unsetPanPricing()
     * @see #setPanPricing(PanPricing)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPanPricingDetail_PanPricing()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricing#getPanPricingDetails
     * @model opposite="PanPricingDetails" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PanPricingDetail.PanPricing' kind='element'"
     * @generated
     */
    PanPricing getPanPricing();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPanPricing <em>Pan Pricing</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pan Pricing</em>' reference.
     * @see #isSetPanPricing()
     * @see #unsetPanPricing()
     * @see #getPanPricing()
     * @generated
     */
    void setPanPricing( PanPricing value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPanPricing <em>Pan Pricing</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPanPricing()
     * @see #getPanPricing()
     * @see #setPanPricing(PanPricing)
     * @generated
     */
    void unsetPanPricing();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PanPricingDetail#getPanPricing <em>Pan Pricing</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pan Pricing</em>' reference is set.
     * @see #unsetPanPricing()
     * @see #getPanPricing()
     * @see #setPanPricing(PanPricing)
     * @generated
     */
    boolean isSetPanPricing();

} // PanPricingDetail
