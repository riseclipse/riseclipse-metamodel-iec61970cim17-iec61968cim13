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
 * A representation of the model object '<em><b>Hydro Power Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getReservoir <em>Reservoir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant()
 * @model
 * @generated
 */
public interface HydroPowerPlant extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Discharge Travel Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Discharge Travel Delay</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Discharge Travel Delay</em>' attribute.
     * @see #isSetDischargeTravelDelay()
     * @see #unsetDischargeTravelDelay()
     * @see #setDischargeTravelDelay(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_DischargeTravelDelay()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.dischargeTravelDelay' kind='element'"
     * @generated
     */
    Float getDischargeTravelDelay();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discharge Travel Delay</em>' attribute.
     * @see #isSetDischargeTravelDelay()
     * @see #unsetDischargeTravelDelay()
     * @see #getDischargeTravelDelay()
     * @generated
     */
    void setDischargeTravelDelay( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDischargeTravelDelay()
     * @see #getDischargeTravelDelay()
     * @see #setDischargeTravelDelay(Float)
     * @generated
     */
    void unsetDischargeTravelDelay();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getDischargeTravelDelay <em>Discharge Travel Delay</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discharge Travel Delay</em>' attribute is set.
     * @see #unsetDischargeTravelDelay()
     * @see #getDischargeTravelDelay()
     * @see #setDischargeTravelDelay(Float)
     * @generated
     */
    boolean isSetDischargeTravelDelay();

    /**
     * Returns the value of the '<em><b>Gen Rated P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gen Rated P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gen Rated P</em>' attribute.
     * @see #isSetGenRatedP()
     * @see #unsetGenRatedP()
     * @see #setGenRatedP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_GenRatedP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.genRatedP' kind='element'"
     * @generated
     */
    Float getGenRatedP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gen Rated P</em>' attribute.
     * @see #isSetGenRatedP()
     * @see #unsetGenRatedP()
     * @see #getGenRatedP()
     * @generated
     */
    void setGenRatedP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenRatedP()
     * @see #getGenRatedP()
     * @see #setGenRatedP(Float)
     * @generated
     */
    void unsetGenRatedP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenRatedP <em>Gen Rated P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen Rated P</em>' attribute is set.
     * @see #unsetGenRatedP()
     * @see #getGenRatedP()
     * @see #setGenRatedP(Float)
     * @generated
     */
    boolean isSetGenRatedP();

    /**
     * Returns the value of the '<em><b>Hydro Plant Storage Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPlantStorageKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Plant Storage Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Plant Storage Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPlantStorageKind
     * @see #isSetHydroPlantStorageType()
     * @see #unsetHydroPlantStorageType()
     * @see #setHydroPlantStorageType(HydroPlantStorageKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_HydroPlantStorageType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.hydroPlantStorageType' kind='element'"
     * @generated
     */
    HydroPlantStorageKind getHydroPlantStorageType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Plant Storage Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPlantStorageKind
     * @see #isSetHydroPlantStorageType()
     * @see #unsetHydroPlantStorageType()
     * @see #getHydroPlantStorageType()
     * @generated
     */
    void setHydroPlantStorageType( HydroPlantStorageKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPlantStorageType()
     * @see #getHydroPlantStorageType()
     * @see #setHydroPlantStorageType(HydroPlantStorageKind)
     * @generated
     */
    void unsetHydroPlantStorageType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPlantStorageType <em>Hydro Plant Storage Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Plant Storage Type</em>' attribute is set.
     * @see #unsetHydroPlantStorageType()
     * @see #getHydroPlantStorageType()
     * @see #setHydroPlantStorageType(HydroPlantStorageKind)
     * @generated
     */
    boolean isSetHydroPlantStorageType();

    /**
     * Returns the value of the '<em><b>Penstock Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Penstock Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Penstock Type</em>' attribute.
     * @see #isSetPenstockType()
     * @see #unsetPenstockType()
     * @see #setPenstockType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_PenstockType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.penstockType' kind='element'"
     * @generated
     */
    String getPenstockType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Penstock Type</em>' attribute.
     * @see #isSetPenstockType()
     * @see #unsetPenstockType()
     * @see #getPenstockType()
     * @generated
     */
    void setPenstockType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPenstockType()
     * @see #getPenstockType()
     * @see #setPenstockType(String)
     * @generated
     */
    void unsetPenstockType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPenstockType <em>Penstock Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Penstock Type</em>' attribute is set.
     * @see #unsetPenstockType()
     * @see #getPenstockType()
     * @see #setPenstockType(String)
     * @generated
     */
    boolean isSetPenstockType();

    /**
     * Returns the value of the '<em><b>Plant Discharge Capacity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plant Discharge Capacity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plant Discharge Capacity</em>' attribute.
     * @see #isSetPlantDischargeCapacity()
     * @see #unsetPlantDischargeCapacity()
     * @see #setPlantDischargeCapacity(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_PlantDischargeCapacity()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.plantDischargeCapacity' kind='element'"
     * @generated
     */
    Float getPlantDischargeCapacity();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plant Discharge Capacity</em>' attribute.
     * @see #isSetPlantDischargeCapacity()
     * @see #unsetPlantDischargeCapacity()
     * @see #getPlantDischargeCapacity()
     * @generated
     */
    void setPlantDischargeCapacity( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlantDischargeCapacity()
     * @see #getPlantDischargeCapacity()
     * @see #setPlantDischargeCapacity(Float)
     * @generated
     */
    void unsetPlantDischargeCapacity();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPlantDischargeCapacity <em>Plant Discharge Capacity</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plant Discharge Capacity</em>' attribute is set.
     * @see #unsetPlantDischargeCapacity()
     * @see #getPlantDischargeCapacity()
     * @see #setPlantDischargeCapacity(Float)
     * @generated
     */
    boolean isSetPlantDischargeCapacity();

    /**
     * Returns the value of the '<em><b>Plant Rated Head</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Plant Rated Head</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Plant Rated Head</em>' attribute.
     * @see #isSetPlantRatedHead()
     * @see #unsetPlantRatedHead()
     * @see #setPlantRatedHead(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_PlantRatedHead()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.plantRatedHead' kind='element'"
     * @generated
     */
    Float getPlantRatedHead();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plant Rated Head</em>' attribute.
     * @see #isSetPlantRatedHead()
     * @see #unsetPlantRatedHead()
     * @see #getPlantRatedHead()
     * @generated
     */
    void setPlantRatedHead( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlantRatedHead()
     * @see #getPlantRatedHead()
     * @see #setPlantRatedHead(Float)
     * @generated
     */
    void unsetPlantRatedHead();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPlantRatedHead <em>Plant Rated Head</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plant Rated Head</em>' attribute is set.
     * @see #unsetPlantRatedHead()
     * @see #getPlantRatedHead()
     * @see #setPlantRatedHead(Float)
     * @generated
     */
    boolean isSetPlantRatedHead();

    /**
     * Returns the value of the '<em><b>Pump Rated P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pump Rated P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pump Rated P</em>' attribute.
     * @see #isSetPumpRatedP()
     * @see #unsetPumpRatedP()
     * @see #setPumpRatedP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_PumpRatedP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.pumpRatedP' kind='element'"
     * @generated
     */
    Float getPumpRatedP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pump Rated P</em>' attribute.
     * @see #isSetPumpRatedP()
     * @see #unsetPumpRatedP()
     * @see #getPumpRatedP()
     * @generated
     */
    void setPumpRatedP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPumpRatedP()
     * @see #getPumpRatedP()
     * @see #setPumpRatedP(Float)
     * @generated
     */
    void unsetPumpRatedP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getPumpRatedP <em>Pump Rated P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pump Rated P</em>' attribute is set.
     * @see #unsetPumpRatedP()
     * @see #getPumpRatedP()
     * @see #setPumpRatedP(Float)
     * @generated
     */
    boolean isSetPumpRatedP();

    /**
     * Returns the value of the '<em><b>Surge Tank Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Surge Tank Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Surge Tank Code</em>' attribute.
     * @see #isSetSurgeTankCode()
     * @see #unsetSurgeTankCode()
     * @see #setSurgeTankCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_SurgeTankCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.surgeTankCode' kind='element'"
     * @generated
     */
    String getSurgeTankCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Surge Tank Code</em>' attribute.
     * @see #isSetSurgeTankCode()
     * @see #unsetSurgeTankCode()
     * @see #getSurgeTankCode()
     * @generated
     */
    void setSurgeTankCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSurgeTankCode()
     * @see #getSurgeTankCode()
     * @see #setSurgeTankCode(String)
     * @generated
     */
    void unsetSurgeTankCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getSurgeTankCode <em>Surge Tank Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Surge Tank Code</em>' attribute is set.
     * @see #unsetSurgeTankCode()
     * @see #getSurgeTankCode()
     * @see #setSurgeTankCode(String)
     * @generated
     */
    boolean isSetSurgeTankCode();

    /**
     * Returns the value of the '<em><b>Surge Tank Crest Level</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Surge Tank Crest Level</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Surge Tank Crest Level</em>' attribute.
     * @see #isSetSurgeTankCrestLevel()
     * @see #unsetSurgeTankCrestLevel()
     * @see #setSurgeTankCrestLevel(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_SurgeTankCrestLevel()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.surgeTankCrestLevel' kind='element'"
     * @generated
     */
    Float getSurgeTankCrestLevel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Surge Tank Crest Level</em>' attribute.
     * @see #isSetSurgeTankCrestLevel()
     * @see #unsetSurgeTankCrestLevel()
     * @see #getSurgeTankCrestLevel()
     * @generated
     */
    void setSurgeTankCrestLevel( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSurgeTankCrestLevel()
     * @see #getSurgeTankCrestLevel()
     * @see #setSurgeTankCrestLevel(Float)
     * @generated
     */
    void unsetSurgeTankCrestLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getSurgeTankCrestLevel <em>Surge Tank Crest Level</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Surge Tank Crest Level</em>' attribute is set.
     * @see #unsetSurgeTankCrestLevel()
     * @see #getSurgeTankCrestLevel()
     * @see #setSurgeTankCrestLevel(Float)
     * @generated
     */
    boolean isSetSurgeTankCrestLevel();

    /**
     * Returns the value of the '<em><b>Hydro Generating Units</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Generating Units</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Generating Units</em>' reference list.
     * @see #isSetHydroGeneratingUnits()
     * @see #unsetHydroGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_HydroGeneratingUnits()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit#getHydroPowerPlant
     * @model opposite="HydroPowerPlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.HydroGeneratingUnits' kind='element'"
     * @generated
     */
    EList< HydroGeneratingUnit > getHydroGeneratingUnits();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroGeneratingUnits()
     * @see #getHydroGeneratingUnits()
     * @generated
     */
    void unsetHydroGeneratingUnits();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroGeneratingUnits <em>Hydro Generating Units</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Generating Units</em>' reference list is set.
     * @see #unsetHydroGeneratingUnits()
     * @see #getHydroGeneratingUnits()
     * @generated
     */
    boolean isSetHydroGeneratingUnits();

    /**
     * Returns the value of the '<em><b>Reservoir</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getHydroPowerPlants <em>Hydro Power Plants</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reservoir</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reservoir</em>' reference.
     * @see #isSetReservoir()
     * @see #unsetReservoir()
     * @see #setReservoir(Reservoir)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_Reservoir()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getHydroPowerPlants
     * @model opposite="HydroPowerPlants" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.Reservoir' kind='element'"
     * @generated
     */
    Reservoir getReservoir();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getReservoir <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reservoir</em>' reference.
     * @see #isSetReservoir()
     * @see #unsetReservoir()
     * @see #getReservoir()
     * @generated
     */
    void setReservoir( Reservoir value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getReservoir <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReservoir()
     * @see #getReservoir()
     * @see #setReservoir(Reservoir)
     * @generated
     */
    void unsetReservoir();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getReservoir <em>Reservoir</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reservoir</em>' reference is set.
     * @see #unsetReservoir()
     * @see #getReservoir()
     * @see #setReservoir(Reservoir)
     * @generated
     */
    boolean isSetReservoir();

    /**
     * Returns the value of the '<em><b>Gen Source Pump Discharge Reservoir</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getUpstreamFromHydroPowerPlants <em>Upstream From Hydro Power Plants</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gen Source Pump Discharge Reservoir</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gen Source Pump Discharge Reservoir</em>' reference.
     * @see #isSetGenSourcePumpDischargeReservoir()
     * @see #unsetGenSourcePumpDischargeReservoir()
     * @see #setGenSourcePumpDischargeReservoir(Reservoir)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_GenSourcePumpDischargeReservoir()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir#getUpstreamFromHydroPowerPlants
     * @model opposite="UpstreamFromHydroPowerPlants" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.GenSourcePumpDischargeReservoir' kind='element'"
     * @generated
     */
    Reservoir getGenSourcePumpDischargeReservoir();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gen Source Pump Discharge Reservoir</em>' reference.
     * @see #isSetGenSourcePumpDischargeReservoir()
     * @see #unsetGenSourcePumpDischargeReservoir()
     * @see #getGenSourcePumpDischargeReservoir()
     * @generated
     */
    void setGenSourcePumpDischargeReservoir( Reservoir value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenSourcePumpDischargeReservoir()
     * @see #getGenSourcePumpDischargeReservoir()
     * @see #setGenSourcePumpDischargeReservoir(Reservoir)
     * @generated
     */
    void unsetGenSourcePumpDischargeReservoir();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getGenSourcePumpDischargeReservoir <em>Gen Source Pump Discharge Reservoir</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen Source Pump Discharge Reservoir</em>' reference is set.
     * @see #unsetGenSourcePumpDischargeReservoir()
     * @see #getGenSourcePumpDischargeReservoir()
     * @see #setGenSourcePumpDischargeReservoir(Reservoir)
     * @generated
     */
    boolean isSetGenSourcePumpDischargeReservoir();

    /**
     * Returns the value of the '<em><b>Hydro Pumps</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPowerPlant <em>Hydro Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hydro Pumps</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hydro Pumps</em>' reference list.
     * @see #isSetHydroPumps()
     * @see #unsetHydroPumps()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getHydroPowerPlant_HydroPumps()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump#getHydroPowerPlant
     * @model opposite="HydroPowerPlant" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='HydroPowerPlant.HydroPumps' kind='element'"
     * @generated
     */
    EList< HydroPump > getHydroPumps();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPumps()
     * @see #getHydroPumps()
     * @generated
     */
    void unsetHydroPumps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant#getHydroPumps <em>Hydro Pumps</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Pumps</em>' reference list is set.
     * @see #unsetHydroPumps()
     * @see #getHydroPumps()
     * @generated
     */
    boolean isSetHydroPumps();

} // HydroPowerPlant
