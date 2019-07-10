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
 * A representation of the model object '<em><b>Hydro Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroGeneratingUnit()
 * @model
 * @generated
 */
public interface HydroGeneratingUnit extends GeneratingUnit {
    /**
     * Returns the value of the '<em><b>Energy Conversion Capability</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroEnergyConversionKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Energy Conversion Capability</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Energy Conversion Capability</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroEnergyConversionKind
     * @see #isSetEnergyConversionCapability()
     * @see #unsetEnergyConversionCapability()
     * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroGeneratingUnit_EnergyConversionCapability()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroGeneratingUnit.energyConversionCapability' kind='element'"
     * @generated
     */
    HydroEnergyConversionKind getEnergyConversionCapability();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Conversion Capability</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroEnergyConversionKind
     * @see #isSetEnergyConversionCapability()
     * @see #unsetEnergyConversionCapability()
     * @see #getEnergyConversionCapability()
     * @generated
     */
    void setEnergyConversionCapability( HydroEnergyConversionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyConversionCapability()
     * @see #getEnergyConversionCapability()
     * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
     * @generated
     */
    void unsetEnergyConversionCapability();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getEnergyConversionCapability <em>Energy Conversion Capability</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Conversion Capability</em>' attribute is set.
     * @see #unsetEnergyConversionCapability()
     * @see #getEnergyConversionCapability()
     * @see #setEnergyConversionCapability(HydroEnergyConversionKind)
     * @generated
     */
    boolean isSetEnergyConversionCapability();

    /**
     * Returns the value of the '<em><b>Hydro Unit Water Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Unit Water Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Unit Water Cost</em>' attribute.
     * @see #isSetHydroUnitWaterCost()
     * @see #unsetHydroUnitWaterCost()
     * @see #setHydroUnitWaterCost(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroGeneratingUnit_HydroUnitWaterCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroGeneratingUnit.hydroUnitWaterCost' kind='element'"
     * @generated
     */
    Float getHydroUnitWaterCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Unit Water Cost</em>' attribute.
     * @see #isSetHydroUnitWaterCost()
     * @see #unsetHydroUnitWaterCost()
     * @see #getHydroUnitWaterCost()
     * @generated
     */
    void setHydroUnitWaterCost( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroUnitWaterCost()
     * @see #getHydroUnitWaterCost()
     * @see #setHydroUnitWaterCost(Float)
     * @generated
     */
    void unsetHydroUnitWaterCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroUnitWaterCost <em>Hydro Unit Water Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Unit Water Cost</em>' attribute is set.
     * @see #unsetHydroUnitWaterCost()
     * @see #getHydroUnitWaterCost()
     * @see #setHydroUnitWaterCost(Float)
     * @generated
     */
    boolean isSetHydroUnitWaterCost();

    /**
     * Returns the value of the '<em><b>Hydro Power Plant</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Power Plant</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Power Plant</em>' reference.
     * @see #isSetHydroPowerPlant()
     * @see #unsetHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroGeneratingUnit_HydroPowerPlant()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroGeneratingUnits
     * @model opposite="HydroGeneratingUnits" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroGeneratingUnit.HydroPowerPlant' kind='element'"
     * @generated
     */
    HydroPowerPlant getHydroPowerPlant();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Power Plant</em>' reference.
     * @see #isSetHydroPowerPlant()
     * @see #unsetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @generated
     */
    void setHydroPowerPlant( HydroPowerPlant value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @generated
     */
    void unsetHydroPowerPlant();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Power Plant</em>' reference is set.
     * @see #unsetHydroPowerPlant()
     * @see #getHydroPowerPlant()
     * @see #setHydroPowerPlant(HydroPowerPlant)
     * @generated
     */
    boolean isSetHydroPowerPlant();

    /**
     * Returns the value of the '<em><b>Penstock Loss Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PenstockLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Penstock Loss Curve</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Penstock Loss Curve</em>' reference.
     * @see #isSetPenstockLossCurve()
     * @see #unsetPenstockLossCurve()
     * @see #setPenstockLossCurve(PenstockLossCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroGeneratingUnit_PenstockLossCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PenstockLossCurve#getHydroGeneratingUnit
     * @model opposite="HydroGeneratingUnit" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroGeneratingUnit.PenstockLossCurve' kind='element'"
     * @generated
     */
    PenstockLossCurve getPenstockLossCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Penstock Loss Curve</em>' reference.
     * @see #isSetPenstockLossCurve()
     * @see #unsetPenstockLossCurve()
     * @see #getPenstockLossCurve()
     * @generated
     */
    void setPenstockLossCurve( PenstockLossCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPenstockLossCurve()
     * @see #getPenstockLossCurve()
     * @see #setPenstockLossCurve(PenstockLossCurve)
     * @generated
     */
    void unsetPenstockLossCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getPenstockLossCurve <em>Penstock Loss Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Penstock Loss Curve</em>' reference is set.
     * @see #unsetPenstockLossCurve()
     * @see #getPenstockLossCurve()
     * @see #setPenstockLossCurve(PenstockLossCurve)
     * @generated
     */
    boolean isSetPenstockLossCurve();

    /**
     * Returns the value of the '<em><b>Hydro Generating Efficiency Curves</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingEfficiencyCurve}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Generating Efficiency Curves</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Generating Efficiency Curves</em>' reference list.
     * @see #isSetHydroGeneratingEfficiencyCurves()
     * @see #unsetHydroGeneratingEfficiencyCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroGeneratingUnit_HydroGeneratingEfficiencyCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingEfficiencyCurve#getHydroGeneratingUnit
     * @model opposite="HydroGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroGeneratingUnit.HydroGeneratingEfficiencyCurves' kind='element'"
     * @generated
     */
    EList< HydroGeneratingEfficiencyCurve > getHydroGeneratingEfficiencyCurves();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroGeneratingEfficiencyCurves()
     * @see #getHydroGeneratingEfficiencyCurves()
     * @generated
     */
    void unsetHydroGeneratingEfficiencyCurves();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroGeneratingEfficiencyCurves <em>Hydro Generating Efficiency Curves</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Generating Efficiency Curves</em>' reference list is set.
     * @see #unsetHydroGeneratingEfficiencyCurves()
     * @see #getHydroGeneratingEfficiencyCurves()
     * @generated
     */
    boolean isSetHydroGeneratingEfficiencyCurves();

    /**
     * Returns the value of the '<em><b>Tailbay Loss Curve</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TailbayLossCurve}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TailbayLossCurve#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tailbay Loss Curve</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tailbay Loss Curve</em>' reference list.
     * @see #isSetTailbayLossCurve()
     * @see #unsetTailbayLossCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroGeneratingUnit_TailbayLossCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TailbayLossCurve#getHydroGeneratingUnit
     * @model opposite="HydroGeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroGeneratingUnit.TailbayLossCurve' kind='element'"
     * @generated
     */
    EList< TailbayLossCurve > getTailbayLossCurve();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTailbayLossCurve()
     * @see #getTailbayLossCurve()
     * @generated
     */
    void unsetTailbayLossCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getTailbayLossCurve <em>Tailbay Loss Curve</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tailbay Loss Curve</em>' reference list is set.
     * @see #unsetTailbayLossCurve()
     * @see #getTailbayLossCurve()
     * @generated
     */
    boolean isSetTailbayLossCurve();

} // HydroGeneratingUnit
