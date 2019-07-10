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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thermal Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit()
 * @model
 * @generated
 */
public interface ThermalGeneratingUnit extends GeneratingUnit {
    /**
     * Returns the value of the '<em><b>OM Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>OM Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>OM Cost</em>' attribute.
     * @see #isSetOMCost()
     * @see #unsetOMCost()
     * @see #setOMCost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_OMCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.oMCost' kind='element'"
     * @generated
     */
    Float getOMCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>OM Cost</em>' attribute.
     * @see #isSetOMCost()
     * @see #unsetOMCost()
     * @see #getOMCost()
     * @generated
     */
    void setOMCost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOMCost()
     * @see #getOMCost()
     * @see #setOMCost(Float)
     * @generated
     */
    void unsetOMCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getOMCost <em>OM Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>OM Cost</em>' attribute is set.
     * @see #unsetOMCost()
     * @see #getOMCost()
     * @see #setOMCost(Float)
     * @generated
     */
    boolean isSetOMCost();

    /**
     * Returns the value of the '<em><b>Startup Model</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Startup Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Startup Model</em>' reference.
     * @see #isSetStartupModel()
     * @see #unsetStartupModel()
     * @see #setStartupModel(StartupModel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_StartupModel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.StartupModel' kind='element'"
     * @generated
     */
    StartupModel getStartupModel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Model</em>' reference.
     * @see #isSetStartupModel()
     * @see #unsetStartupModel()
     * @see #getStartupModel()
     * @generated
     */
    void setStartupModel( StartupModel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupModel()
     * @see #getStartupModel()
     * @see #setStartupModel(StartupModel)
     * @generated
     */
    void unsetStartupModel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getStartupModel <em>Startup Model</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Model</em>' reference is set.
     * @see #unsetStartupModel()
     * @see #getStartupModel()
     * @see #setStartupModel(StartupModel)
     * @generated
     */
    boolean isSetStartupModel();

    /**
     * Returns the value of the '<em><b>Incremental Heat Rate Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncrementalHeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incremental Heat Rate Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incremental Heat Rate Curve</em>' reference.
     * @see #isSetIncrementalHeatRateCurve()
     * @see #unsetIncrementalHeatRateCurve()
     * @see #setIncrementalHeatRateCurve(IncrementalHeatRateCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_IncrementalHeatRateCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncrementalHeatRateCurve#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.IncrementalHeatRateCurve' kind='element'"
     * @generated
     */
    IncrementalHeatRateCurve getIncrementalHeatRateCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incremental Heat Rate Curve</em>' reference.
     * @see #isSetIncrementalHeatRateCurve()
     * @see #unsetIncrementalHeatRateCurve()
     * @see #getIncrementalHeatRateCurve()
     * @generated
     */
    void setIncrementalHeatRateCurve( IncrementalHeatRateCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIncrementalHeatRateCurve()
     * @see #getIncrementalHeatRateCurve()
     * @see #setIncrementalHeatRateCurve(IncrementalHeatRateCurve)
     * @generated
     */
    void unsetIncrementalHeatRateCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getIncrementalHeatRateCurve <em>Incremental Heat Rate Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Incremental Heat Rate Curve</em>' reference is set.
     * @see #unsetIncrementalHeatRateCurve()
     * @see #getIncrementalHeatRateCurve()
     * @see #setIncrementalHeatRateCurve(IncrementalHeatRateCurve)
     * @generated
     */
    boolean isSetIncrementalHeatRateCurve();

    /**
     * Returns the value of the '<em><b>Emission Curves</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionCurve}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emission Curves</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emission Curves</em>' reference list.
     * @see #isSetEmissionCurves()
     * @see #unsetEmissionCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_EmissionCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionCurve#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.EmissionCurves' kind='element'"
     * @generated
     */
    EList< EmissionCurve > getEmissionCurves();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmissionCurves()
     * @see #getEmissionCurves()
     * @generated
     */
    void unsetEmissionCurves();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getEmissionCurves <em>Emission Curves</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emission Curves</em>' reference list is set.
     * @see #unsetEmissionCurves()
     * @see #getEmissionCurves()
     * @generated
     */
    boolean isSetEmissionCurves();

    /**
     * Returns the value of the '<em><b>Fuel Allocation Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Allocation Schedules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Allocation Schedules</em>' reference list.
     * @see #isSetFuelAllocationSchedules()
     * @see #unsetFuelAllocationSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_FuelAllocationSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.FuelAllocationSchedules' kind='element'"
     * @generated
     */
    EList< FuelAllocationSchedule > getFuelAllocationSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelAllocationSchedules()
     * @see #getFuelAllocationSchedules()
     * @generated
     */
    void unsetFuelAllocationSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Allocation Schedules</em>' reference list is set.
     * @see #unsetFuelAllocationSchedules()
     * @see #getFuelAllocationSchedules()
     * @generated
     */
    boolean isSetFuelAllocationSchedules();

    /**
     * Returns the value of the '<em><b>Combined Cycle Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Combined Cycle Plant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Combined Cycle Plant</em>' reference.
     * @see #isSetCombinedCyclePlant()
     * @see #unsetCombinedCyclePlant()
     * @see #setCombinedCyclePlant(CombinedCyclePlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_CombinedCyclePlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombinedCyclePlant#getThermalGeneratingUnits
     * @model opposite="ThermalGeneratingUnits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.CombinedCyclePlant' kind='element'"
     * @generated
     */
    CombinedCyclePlant getCombinedCyclePlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Combined Cycle Plant</em>' reference.
     * @see #isSetCombinedCyclePlant()
     * @see #unsetCombinedCyclePlant()
     * @see #getCombinedCyclePlant()
     * @generated
     */
    void setCombinedCyclePlant( CombinedCyclePlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCombinedCyclePlant()
     * @see #getCombinedCyclePlant()
     * @see #setCombinedCyclePlant(CombinedCyclePlant)
     * @generated
     */
    void unsetCombinedCyclePlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCombinedCyclePlant <em>Combined Cycle Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Combined Cycle Plant</em>' reference is set.
     * @see #unsetCombinedCyclePlant()
     * @see #getCombinedCyclePlant()
     * @see #setCombinedCyclePlant(CombinedCyclePlant)
     * @generated
     */
    boolean isSetCombinedCyclePlant();

    /**
     * Returns the value of the '<em><b>Shutdown Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShutdownCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shutdown Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shutdown Curve</em>' reference.
     * @see #isSetShutdownCurve()
     * @see #unsetShutdownCurve()
     * @see #setShutdownCurve(ShutdownCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_ShutdownCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShutdownCurve#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.ShutdownCurve' kind='element'"
     * @generated
     */
    ShutdownCurve getShutdownCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shutdown Curve</em>' reference.
     * @see #isSetShutdownCurve()
     * @see #unsetShutdownCurve()
     * @see #getShutdownCurve()
     * @generated
     */
    void setShutdownCurve( ShutdownCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShutdownCurve()
     * @see #getShutdownCurve()
     * @see #setShutdownCurve(ShutdownCurve)
     * @generated
     */
    void unsetShutdownCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getShutdownCurve <em>Shutdown Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shutdown Curve</em>' reference is set.
     * @see #unsetShutdownCurve()
     * @see #getShutdownCurve()
     * @see #setShutdownCurve(ShutdownCurve)
     * @generated
     */
    boolean isSetShutdownCurve();

    /**
     * Returns the value of the '<em><b>Heat Rate Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRateCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heat Rate Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heat Rate Curve</em>' reference.
     * @see #isSetHeatRateCurve()
     * @see #unsetHeatRateCurve()
     * @see #setHeatRateCurve(HeatRateCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_HeatRateCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatRateCurve#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.HeatRateCurve' kind='element'"
     * @generated
     */
    HeatRateCurve getHeatRateCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heat Rate Curve</em>' reference.
     * @see #isSetHeatRateCurve()
     * @see #unsetHeatRateCurve()
     * @see #getHeatRateCurve()
     * @generated
     */
    void setHeatRateCurve( HeatRateCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeatRateCurve()
     * @see #getHeatRateCurve()
     * @see #setHeatRateCurve(HeatRateCurve)
     * @generated
     */
    void unsetHeatRateCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatRateCurve <em>Heat Rate Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Heat Rate Curve</em>' reference is set.
     * @see #unsetHeatRateCurve()
     * @see #getHeatRateCurve()
     * @see #setHeatRateCurve(HeatRateCurve)
     * @generated
     */
    boolean isSetHeatRateCurve();

    /**
     * Returns the value of the '<em><b>Fossil Fuels</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fossil Fuels</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fossil Fuels</em>' reference list.
     * @see #isSetFossilFuels()
     * @see #unsetFossilFuels()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_FossilFuels()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.FossilFuels' kind='element'"
     * @generated
     */
    EList< FossilFuel > getFossilFuels();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFossilFuels()
     * @see #getFossilFuels()
     * @generated
     */
    void unsetFossilFuels();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFossilFuels <em>Fossil Fuels</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fossil Fuels</em>' reference list is set.
     * @see #unsetFossilFuels()
     * @see #getFossilFuels()
     * @generated
     */
    boolean isSetFossilFuels();

    /**
     * Returns the value of the '<em><b>Heat Input Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Heat Input Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Heat Input Curve</em>' reference.
     * @see #isSetHeatInputCurve()
     * @see #unsetHeatInputCurve()
     * @see #setHeatInputCurve(HeatInputCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_HeatInputCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HeatInputCurve#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.HeatInputCurve' kind='element'"
     * @generated
     */
    HeatInputCurve getHeatInputCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Heat Input Curve</em>' reference.
     * @see #isSetHeatInputCurve()
     * @see #unsetHeatInputCurve()
     * @see #getHeatInputCurve()
     * @generated
     */
    void setHeatInputCurve( HeatInputCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHeatInputCurve()
     * @see #getHeatInputCurve()
     * @see #setHeatInputCurve(HeatInputCurve)
     * @generated
     */
    void unsetHeatInputCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getHeatInputCurve <em>Heat Input Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Heat Input Curve</em>' reference is set.
     * @see #unsetHeatInputCurve()
     * @see #getHeatInputCurve()
     * @see #setHeatInputCurve(HeatInputCurve)
     * @generated
     */
    boolean isSetHeatInputCurve();

    /**
     * Returns the value of the '<em><b>CAES Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CAESPlant#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>CAES Plant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>CAES Plant</em>' reference.
     * @see #isSetCAESPlant()
     * @see #unsetCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_CAESPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CAESPlant#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.CAESPlant' kind='element'"
     * @generated
     */
    CAESPlant getCAESPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CAES Plant</em>' reference.
     * @see #isSetCAESPlant()
     * @see #unsetCAESPlant()
     * @see #getCAESPlant()
     * @generated
     */
    void setCAESPlant( CAESPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCAESPlant()
     * @see #getCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @generated
     */
    void unsetCAESPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCAESPlant <em>CAES Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CAES Plant</em>' reference is set.
     * @see #unsetCAESPlant()
     * @see #getCAESPlant()
     * @see #setCAESPlant(CAESPlant)
     * @generated
     */
    boolean isSetCAESPlant();

    /**
     * Returns the value of the '<em><b>Emmission Accounts</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Emmission Accounts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Emmission Accounts</em>' reference list.
     * @see #isSetEmmissionAccounts()
     * @see #unsetEmmissionAccounts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_EmmissionAccounts()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EmissionAccount#getThermalGeneratingUnit
     * @model opposite="ThermalGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.EmmissionAccounts' kind='element'"
     * @generated
     */
    EList< EmissionAccount > getEmmissionAccounts();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmmissionAccounts()
     * @see #getEmmissionAccounts()
     * @generated
     */
    void unsetEmmissionAccounts();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getEmmissionAccounts <em>Emmission Accounts</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emmission Accounts</em>' reference list is set.
     * @see #unsetEmmissionAccounts()
     * @see #getEmmissionAccounts()
     * @generated
     */
    boolean isSetEmmissionAccounts();

    /**
     * Returns the value of the '<em><b>Cogeneration Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getThermalGeneratingUnits <em>Thermal Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cogeneration Plant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cogeneration Plant</em>' reference.
     * @see #isSetCogenerationPlant()
     * @see #unsetCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getThermalGeneratingUnit_CogenerationPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant#getThermalGeneratingUnits
     * @model opposite="ThermalGeneratingUnits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ThermalGeneratingUnit.CogenerationPlant' kind='element'"
     * @generated
     */
    CogenerationPlant getCogenerationPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cogeneration Plant</em>' reference.
     * @see #isSetCogenerationPlant()
     * @see #unsetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @generated
     */
    void setCogenerationPlant( CogenerationPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @generated
     */
    void unsetCogenerationPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getCogenerationPlant <em>Cogeneration Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Cogeneration Plant</em>' reference is set.
     * @see #unsetCogenerationPlant()
     * @see #getCogenerationPlant()
     * @see #setCogenerationPlant(CogenerationPlant)
     * @generated
     */
    boolean isSetCogenerationPlant();

} // ThermalGeneratingUnit
