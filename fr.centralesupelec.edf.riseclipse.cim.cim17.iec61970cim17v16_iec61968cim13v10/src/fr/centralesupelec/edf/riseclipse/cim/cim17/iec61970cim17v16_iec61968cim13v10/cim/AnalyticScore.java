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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analytic Score</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getCalculationDateTime <em>Calculation Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getEffectiveDateTime <em>Effective Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getValue <em>Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAssetGroup <em>Asset Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAssetAggregateScore <em>Asset Aggregate Score</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAnalytic <em>Analytic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAsset <em>Asset</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticScore()
 * @model
 * @generated
 */
public interface AnalyticScore extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Calculation Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Calculation Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Calculation Date Time</em>' attribute.
     * @see #isSetCalculationDateTime()
     * @see #unsetCalculationDateTime()
     * @see #setCalculationDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticScore_CalculationDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalyticScore.calculationDateTime' kind='element'"
     * @generated
     */
    Date getCalculationDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getCalculationDateTime <em>Calculation Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Calculation Date Time</em>' attribute.
     * @see #isSetCalculationDateTime()
     * @see #unsetCalculationDateTime()
     * @see #getCalculationDateTime()
     * @generated
     */
    void setCalculationDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getCalculationDateTime <em>Calculation Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCalculationDateTime()
     * @see #getCalculationDateTime()
     * @see #setCalculationDateTime(Date)
     * @generated
     */
    void unsetCalculationDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getCalculationDateTime <em>Calculation Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Calculation Date Time</em>' attribute is set.
     * @see #unsetCalculationDateTime()
     * @see #getCalculationDateTime()
     * @see #setCalculationDateTime(Date)
     * @generated
     */
    boolean isSetCalculationDateTime();

    /**
     * Returns the value of the '<em><b>Effective Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Effective Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Effective Date Time</em>' attribute.
     * @see #isSetEffectiveDateTime()
     * @see #unsetEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticScore_EffectiveDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalyticScore.effectiveDateTime' kind='element'"
     * @generated
     */
    Date getEffectiveDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Effective Date Time</em>' attribute.
     * @see #isSetEffectiveDateTime()
     * @see #unsetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @generated
     */
    void setEffectiveDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getEffectiveDateTime <em>Effective Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @generated
     */
    void unsetEffectiveDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getEffectiveDateTime <em>Effective Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Effective Date Time</em>' attribute is set.
     * @see #unsetEffectiveDateTime()
     * @see #getEffectiveDateTime()
     * @see #setEffectiveDateTime(Date)
     * @generated
     */
    boolean isSetEffectiveDateTime();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #setValue(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticScore_Value()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalyticScore.value' kind='element'"
     * @generated
     */
    Float getValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #isSetValue()
     * @see #unsetValue()
     * @see #getValue()
     * @generated
     */
    void setValue( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetValue()
     * @see #getValue()
     * @see #setValue(Float)
     * @generated
     */
    void unsetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getValue <em>Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Value</em>' attribute is set.
     * @see #unsetValue()
     * @see #getValue()
     * @see #setValue(Float)
     * @generated
     */
    boolean isSetValue();

    /**
     * Returns the value of the '<em><b>Asset Group</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup#getAnalyticScore <em>Analytic Score</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Group</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Group</em>' reference.
     * @see #isSetAssetGroup()
     * @see #unsetAssetGroup()
     * @see #setAssetGroup(AssetGroup)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticScore_AssetGroup()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AssetGroup#getAnalyticScore
     * @model opposite="AnalyticScore" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalyticScore.AssetGroup' kind='element'"
     * @generated
     */
    AssetGroup getAssetGroup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAssetGroup <em>Asset Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Group</em>' reference.
     * @see #isSetAssetGroup()
     * @see #unsetAssetGroup()
     * @see #getAssetGroup()
     * @generated
     */
    void setAssetGroup( AssetGroup value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAssetGroup <em>Asset Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetGroup()
     * @see #getAssetGroup()
     * @see #setAssetGroup(AssetGroup)
     * @generated
     */
    void unsetAssetGroup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAssetGroup <em>Asset Group</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Group</em>' reference is set.
     * @see #unsetAssetGroup()
     * @see #getAssetGroup()
     * @see #setAssetGroup(AssetGroup)
     * @generated
     */
    boolean isSetAssetGroup();

    /**
     * Returns the value of the '<em><b>Asset Aggregate Score</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AggregateScore#getAnalyticScore <em>Analytic Score</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset Aggregate Score</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset Aggregate Score</em>' reference.
     * @see #isSetAssetAggregateScore()
     * @see #unsetAssetAggregateScore()
     * @see #setAssetAggregateScore(AggregateScore)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticScore_AssetAggregateScore()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AggregateScore#getAnalyticScore
     * @model opposite="AnalyticScore" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalyticScore.AssetAggregateScore' kind='element'"
     * @generated
     */
    AggregateScore getAssetAggregateScore();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAssetAggregateScore <em>Asset Aggregate Score</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset Aggregate Score</em>' reference.
     * @see #isSetAssetAggregateScore()
     * @see #unsetAssetAggregateScore()
     * @see #getAssetAggregateScore()
     * @generated
     */
    void setAssetAggregateScore( AggregateScore value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAssetAggregateScore <em>Asset Aggregate Score</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAssetAggregateScore()
     * @see #getAssetAggregateScore()
     * @see #setAssetAggregateScore(AggregateScore)
     * @generated
     */
    void unsetAssetAggregateScore();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAssetAggregateScore <em>Asset Aggregate Score</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset Aggregate Score</em>' reference is set.
     * @see #unsetAssetAggregateScore()
     * @see #getAssetAggregateScore()
     * @see #setAssetAggregateScore(AggregateScore)
     * @generated
     */
    boolean isSetAssetAggregateScore();

    /**
     * Returns the value of the '<em><b>Analytic</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic#getAnalyticScore <em>Analytic Score</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Analytic</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Analytic</em>' reference.
     * @see #isSetAnalytic()
     * @see #unsetAnalytic()
     * @see #setAnalytic(Analytic)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticScore_Analytic()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Analytic#getAnalyticScore
     * @model opposite="AnalyticScore" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalyticScore.Analytic' kind='element'"
     * @generated
     */
    Analytic getAnalytic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAnalytic <em>Analytic</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Analytic</em>' reference.
     * @see #isSetAnalytic()
     * @see #unsetAnalytic()
     * @see #getAnalytic()
     * @generated
     */
    void setAnalytic( Analytic value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAnalytic <em>Analytic</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAnalytic()
     * @see #getAnalytic()
     * @see #setAnalytic(Analytic)
     * @generated
     */
    void unsetAnalytic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAnalytic <em>Analytic</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Analytic</em>' reference is set.
     * @see #unsetAnalytic()
     * @see #getAnalytic()
     * @see #setAnalytic(Analytic)
     * @generated
     */
    boolean isSetAnalytic();

    /**
     * Returns the value of the '<em><b>Asset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAnalyticScore <em>Analytic Score</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Asset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #setAsset(Asset)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAnalyticScore_Asset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset#getAnalyticScore
     * @model opposite="AnalyticScore" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='AnalyticScore.Asset' kind='element'"
     * @generated
     */
    Asset getAsset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Asset</em>' reference.
     * @see #isSetAsset()
     * @see #unsetAsset()
     * @see #getAsset()
     * @generated
     */
    void setAsset( Asset value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAsset <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    void unsetAsset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AnalyticScore#getAsset <em>Asset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Asset</em>' reference is set.
     * @see #unsetAsset()
     * @see #getAsset()
     * @see #setAsset(Asset)
     * @generated
     */
    boolean isSetAsset();

} // AnalyticScore
