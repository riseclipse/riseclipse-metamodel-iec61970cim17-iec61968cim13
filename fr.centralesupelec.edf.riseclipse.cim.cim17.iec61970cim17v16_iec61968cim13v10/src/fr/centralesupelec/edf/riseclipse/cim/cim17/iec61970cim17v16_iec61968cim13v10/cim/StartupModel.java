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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.math.BigDecimal;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Startup Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupDate <em>Startup Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupPriority <em>Startup Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStbyAuxP <em>Stby Aux P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel()
 * @model
 * @generated
 */
public interface StartupModel extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Fixed Maint Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fixed Maint Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fixed Maint Cost</em>' attribute.
     * @see #isSetFixedMaintCost()
     * @see #unsetFixedMaintCost()
     * @see #setFixedMaintCost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_FixedMaintCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.fixedMaintCost' kind='element'"
     * @generated
     */
    Float getFixedMaintCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fixed Maint Cost</em>' attribute.
     * @see #isSetFixedMaintCost()
     * @see #unsetFixedMaintCost()
     * @see #getFixedMaintCost()
     * @generated
     */
    void setFixedMaintCost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFixedMaintCost()
     * @see #getFixedMaintCost()
     * @see #setFixedMaintCost(Float)
     * @generated
     */
    void unsetFixedMaintCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getFixedMaintCost <em>Fixed Maint Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fixed Maint Cost</em>' attribute is set.
     * @see #unsetFixedMaintCost()
     * @see #getFixedMaintCost()
     * @see #setFixedMaintCost(Float)
     * @generated
     */
    boolean isSetFixedMaintCost();

    /**
     * Returns the value of the '<em><b>Hot Standby Heat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hot Standby Heat</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hot Standby Heat</em>' attribute.
     * @see #isSetHotStandbyHeat()
     * @see #unsetHotStandbyHeat()
     * @see #setHotStandbyHeat(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_HotStandbyHeat()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.hotStandbyHeat' kind='element'"
     * @generated
     */
    Float getHotStandbyHeat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hot Standby Heat</em>' attribute.
     * @see #isSetHotStandbyHeat()
     * @see #unsetHotStandbyHeat()
     * @see #getHotStandbyHeat()
     * @generated
     */
    void setHotStandbyHeat( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHotStandbyHeat()
     * @see #getHotStandbyHeat()
     * @see #setHotStandbyHeat(Float)
     * @generated
     */
    void unsetHotStandbyHeat();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getHotStandbyHeat <em>Hot Standby Heat</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hot Standby Heat</em>' attribute is set.
     * @see #unsetHotStandbyHeat()
     * @see #getHotStandbyHeat()
     * @see #setHotStandbyHeat(Float)
     * @generated
     */
    boolean isSetHotStandbyHeat();

    /**
     * Returns the value of the '<em><b>Incremental Maint Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incremental Maint Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incremental Maint Cost</em>' attribute.
     * @see #isSetIncrementalMaintCost()
     * @see #unsetIncrementalMaintCost()
     * @see #setIncrementalMaintCost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_IncrementalMaintCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.incrementalMaintCost' kind='element'"
     * @generated
     */
    Float getIncrementalMaintCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incremental Maint Cost</em>' attribute.
     * @see #isSetIncrementalMaintCost()
     * @see #unsetIncrementalMaintCost()
     * @see #getIncrementalMaintCost()
     * @generated
     */
    void setIncrementalMaintCost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIncrementalMaintCost()
     * @see #getIncrementalMaintCost()
     * @see #setIncrementalMaintCost(Float)
     * @generated
     */
    void unsetIncrementalMaintCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getIncrementalMaintCost <em>Incremental Maint Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Incremental Maint Cost</em>' attribute is set.
     * @see #unsetIncrementalMaintCost()
     * @see #getIncrementalMaintCost()
     * @see #setIncrementalMaintCost(Float)
     * @generated
     */
    boolean isSetIncrementalMaintCost();

    /**
     * Returns the value of the '<em><b>Minimum Down Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum Down Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum Down Time</em>' attribute.
     * @see #isSetMinimumDownTime()
     * @see #unsetMinimumDownTime()
     * @see #setMinimumDownTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_MinimumDownTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.minimumDownTime' kind='element'"
     * @generated
     */
    Float getMinimumDownTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum Down Time</em>' attribute.
     * @see #isSetMinimumDownTime()
     * @see #unsetMinimumDownTime()
     * @see #getMinimumDownTime()
     * @generated
     */
    void setMinimumDownTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinimumDownTime()
     * @see #getMinimumDownTime()
     * @see #setMinimumDownTime(Float)
     * @generated
     */
    void unsetMinimumDownTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getMinimumDownTime <em>Minimum Down Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minimum Down Time</em>' attribute is set.
     * @see #unsetMinimumDownTime()
     * @see #getMinimumDownTime()
     * @see #setMinimumDownTime(Float)
     * @generated
     */
    boolean isSetMinimumDownTime();

    /**
     * Returns the value of the '<em><b>Minimum Run Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum Run Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum Run Time</em>' attribute.
     * @see #isSetMinimumRunTime()
     * @see #unsetMinimumRunTime()
     * @see #setMinimumRunTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_MinimumRunTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.minimumRunTime' kind='element'"
     * @generated
     */
    Float getMinimumRunTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum Run Time</em>' attribute.
     * @see #isSetMinimumRunTime()
     * @see #unsetMinimumRunTime()
     * @see #getMinimumRunTime()
     * @generated
     */
    void setMinimumRunTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinimumRunTime()
     * @see #getMinimumRunTime()
     * @see #setMinimumRunTime(Float)
     * @generated
     */
    void unsetMinimumRunTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getMinimumRunTime <em>Minimum Run Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minimum Run Time</em>' attribute is set.
     * @see #unsetMinimumRunTime()
     * @see #getMinimumRunTime()
     * @see #setMinimumRunTime(Float)
     * @generated
     */
    boolean isSetMinimumRunTime();

    /**
     * Returns the value of the '<em><b>Risk Factor Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Risk Factor Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Risk Factor Cost</em>' attribute.
     * @see #isSetRiskFactorCost()
     * @see #unsetRiskFactorCost()
     * @see #setRiskFactorCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_RiskFactorCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.riskFactorCost' kind='element'"
     * @generated
     */
    BigDecimal getRiskFactorCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Risk Factor Cost</em>' attribute.
     * @see #isSetRiskFactorCost()
     * @see #unsetRiskFactorCost()
     * @see #getRiskFactorCost()
     * @generated
     */
    void setRiskFactorCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRiskFactorCost()
     * @see #getRiskFactorCost()
     * @see #setRiskFactorCost(BigDecimal)
     * @generated
     */
    void unsetRiskFactorCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getRiskFactorCost <em>Risk Factor Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Risk Factor Cost</em>' attribute is set.
     * @see #unsetRiskFactorCost()
     * @see #getRiskFactorCost()
     * @see #setRiskFactorCost(BigDecimal)
     * @generated
     */
    boolean isSetRiskFactorCost();

    /**
     * Returns the value of the '<em><b>Startup Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Startup Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Startup Cost</em>' attribute.
     * @see #isSetStartupCost()
     * @see #unsetStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_StartupCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.startupCost' kind='element'"
     * @generated
     */
    BigDecimal getStartupCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupCost <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Cost</em>' attribute.
     * @see #isSetStartupCost()
     * @see #unsetStartupCost()
     * @see #getStartupCost()
     * @generated
     */
    void setStartupCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupCost <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupCost()
     * @see #getStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @generated
     */
    void unsetStartupCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupCost <em>Startup Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Cost</em>' attribute is set.
     * @see #unsetStartupCost()
     * @see #getStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @generated
     */
    boolean isSetStartupCost();

    /**
     * Returns the value of the '<em><b>Startup Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Startup Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Startup Date</em>' attribute.
     * @see #isSetStartupDate()
     * @see #unsetStartupDate()
     * @see #setStartupDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_StartupDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.startupDate' kind='element'"
     * @generated
     */
    Date getStartupDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupDate <em>Startup Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Date</em>' attribute.
     * @see #isSetStartupDate()
     * @see #unsetStartupDate()
     * @see #getStartupDate()
     * @generated
     */
    void setStartupDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupDate <em>Startup Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupDate()
     * @see #getStartupDate()
     * @see #setStartupDate(Date)
     * @generated
     */
    void unsetStartupDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupDate <em>Startup Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Date</em>' attribute is set.
     * @see #unsetStartupDate()
     * @see #getStartupDate()
     * @see #setStartupDate(Date)
     * @generated
     */
    boolean isSetStartupDate();

    /**
     * Returns the value of the '<em><b>Startup Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Startup Priority</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Startup Priority</em>' attribute.
     * @see #isSetStartupPriority()
     * @see #unsetStartupPriority()
     * @see #setStartupPriority(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_StartupPriority()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.startupPriority' kind='element'"
     * @generated
     */
    Integer getStartupPriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupPriority <em>Startup Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Priority</em>' attribute.
     * @see #isSetStartupPriority()
     * @see #unsetStartupPriority()
     * @see #getStartupPriority()
     * @generated
     */
    void setStartupPriority( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupPriority <em>Startup Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupPriority()
     * @see #getStartupPriority()
     * @see #setStartupPriority(Integer)
     * @generated
     */
    void unsetStartupPriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartupPriority <em>Startup Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Priority</em>' attribute is set.
     * @see #unsetStartupPriority()
     * @see #getStartupPriority()
     * @see #setStartupPriority(Integer)
     * @generated
     */
    boolean isSetStartupPriority();

    /**
     * Returns the value of the '<em><b>Stby Aux P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stby Aux P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stby Aux P</em>' attribute.
     * @see #isSetStbyAuxP()
     * @see #unsetStbyAuxP()
     * @see #setStbyAuxP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_StbyAuxP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.stbyAuxP' kind='element'"
     * @generated
     */
    Float getStbyAuxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStbyAuxP <em>Stby Aux P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stby Aux P</em>' attribute.
     * @see #isSetStbyAuxP()
     * @see #unsetStbyAuxP()
     * @see #getStbyAuxP()
     * @generated
     */
    void setStbyAuxP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStbyAuxP <em>Stby Aux P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStbyAuxP()
     * @see #getStbyAuxP()
     * @see #setStbyAuxP(Float)
     * @generated
     */
    void unsetStbyAuxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStbyAuxP <em>Stby Aux P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stby Aux P</em>' attribute is set.
     * @see #unsetStbyAuxP()
     * @see #getStbyAuxP()
     * @see #setStbyAuxP(Float)
     * @generated
     */
    boolean isSetStbyAuxP();

    /**
     * Returns the value of the '<em><b>Start Ramp Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getStartupModel <em>Startup Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Ramp Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Ramp Curve</em>' reference.
     * @see #isSetStartRampCurve()
     * @see #unsetStartRampCurve()
     * @see #setStartRampCurve(StartRampCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_StartRampCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartRampCurve#getStartupModel
     * @model opposite="StartupModel" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.StartRampCurve' kind='element'"
     * @generated
     */
    StartRampCurve getStartRampCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Ramp Curve</em>' reference.
     * @see #isSetStartRampCurve()
     * @see #unsetStartRampCurve()
     * @see #getStartRampCurve()
     * @generated
     */
    void setStartRampCurve( StartRampCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartRampCurve()
     * @see #getStartRampCurve()
     * @see #setStartRampCurve(StartRampCurve)
     * @generated
     */
    void unsetStartRampCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartRampCurve <em>Start Ramp Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Ramp Curve</em>' reference is set.
     * @see #unsetStartRampCurve()
     * @see #getStartRampCurve()
     * @see #setStartRampCurve(StartRampCurve)
     * @generated
     */
    boolean isSetStartRampCurve();

    /**
     * Returns the value of the '<em><b>Start Ign Fuel Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartIgnFuelCurve#getStartupModel <em>Startup Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Ign Fuel Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Ign Fuel Curve</em>' reference.
     * @see #isSetStartIgnFuelCurve()
     * @see #unsetStartIgnFuelCurve()
     * @see #setStartIgnFuelCurve(StartIgnFuelCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_StartIgnFuelCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartIgnFuelCurve#getStartupModel
     * @model opposite="StartupModel" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.StartIgnFuelCurve' kind='element'"
     * @generated
     */
    StartIgnFuelCurve getStartIgnFuelCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Ign Fuel Curve</em>' reference.
     * @see #isSetStartIgnFuelCurve()
     * @see #unsetStartIgnFuelCurve()
     * @see #getStartIgnFuelCurve()
     * @generated
     */
    void setStartIgnFuelCurve( StartIgnFuelCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartIgnFuelCurve()
     * @see #getStartIgnFuelCurve()
     * @see #setStartIgnFuelCurve(StartIgnFuelCurve)
     * @generated
     */
    void unsetStartIgnFuelCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartIgnFuelCurve <em>Start Ign Fuel Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Ign Fuel Curve</em>' reference is set.
     * @see #unsetStartIgnFuelCurve()
     * @see #getStartIgnFuelCurve()
     * @see #setStartIgnFuelCurve(StartIgnFuelCurve)
     * @generated
     */
    boolean isSetStartIgnFuelCurve();

    /**
     * Returns the value of the '<em><b>Start Main Fuel Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartMainFuelCurve#getStartupModel <em>Startup Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start Main Fuel Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start Main Fuel Curve</em>' reference.
     * @see #isSetStartMainFuelCurve()
     * @see #unsetStartMainFuelCurve()
     * @see #setStartMainFuelCurve(StartMainFuelCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_StartMainFuelCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartMainFuelCurve#getStartupModel
     * @model opposite="StartupModel" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.StartMainFuelCurve' kind='element'"
     * @generated
     */
    StartMainFuelCurve getStartMainFuelCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start Main Fuel Curve</em>' reference.
     * @see #isSetStartMainFuelCurve()
     * @see #unsetStartMainFuelCurve()
     * @see #getStartMainFuelCurve()
     * @generated
     */
    void setStartMainFuelCurve( StartMainFuelCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartMainFuelCurve()
     * @see #getStartMainFuelCurve()
     * @see #setStartMainFuelCurve(StartMainFuelCurve)
     * @generated
     */
    void unsetStartMainFuelCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getStartMainFuelCurve <em>Start Main Fuel Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Start Main Fuel Curve</em>' reference is set.
     * @see #unsetStartMainFuelCurve()
     * @see #getStartMainFuelCurve()
     * @see #setStartMainFuelCurve(StartMainFuelCurve)
     * @generated
     */
    boolean isSetStartMainFuelCurve();

    /**
     * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thermal Generating Unit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thermal Generating Unit</em>' reference.
     * @see #isSetThermalGeneratingUnit()
     * @see #unsetThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getStartupModel_ThermalGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getStartupModel
     * @model opposite="StartupModel" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='StartupModel.ThermalGeneratingUnit' kind='element'"
     * @generated
     */
    ThermalGeneratingUnit getThermalGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thermal Generating Unit</em>' reference.
     * @see #isSetThermalGeneratingUnit()
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @generated
     */
    void setThermalGeneratingUnit( ThermalGeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    void unsetThermalGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thermal Generating Unit</em>' reference is set.
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    boolean isSetThermalGeneratingUnit();

} // StartupModel
