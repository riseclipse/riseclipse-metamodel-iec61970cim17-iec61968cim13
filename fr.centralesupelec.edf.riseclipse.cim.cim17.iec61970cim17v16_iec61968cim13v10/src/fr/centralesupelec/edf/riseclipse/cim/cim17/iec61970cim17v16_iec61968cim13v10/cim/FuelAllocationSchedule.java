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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuel Allocation Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelAllocationSchedule()
 * @model
 * @generated
 */
public interface FuelAllocationSchedule extends Curve {
    /**
     * Returns the value of the '<em><b>Fuel Allocation End Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Allocation End Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Allocation End Date</em>' attribute.
     * @see #isSetFuelAllocationEndDate()
     * @see #unsetFuelAllocationEndDate()
     * @see #setFuelAllocationEndDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelAllocationSchedule_FuelAllocationEndDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FuelAllocationSchedule.fuelAllocationEndDate' kind='element'"
     * @generated
     */
    Date getFuelAllocationEndDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Allocation End Date</em>' attribute.
     * @see #isSetFuelAllocationEndDate()
     * @see #unsetFuelAllocationEndDate()
     * @see #getFuelAllocationEndDate()
     * @generated
     */
    void setFuelAllocationEndDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelAllocationEndDate()
     * @see #getFuelAllocationEndDate()
     * @see #setFuelAllocationEndDate(Date)
     * @generated
     */
    void unsetFuelAllocationEndDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelAllocationEndDate <em>Fuel Allocation End Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Allocation End Date</em>' attribute is set.
     * @see #unsetFuelAllocationEndDate()
     * @see #getFuelAllocationEndDate()
     * @see #setFuelAllocationEndDate(Date)
     * @generated
     */
    boolean isSetFuelAllocationEndDate();

    /**
     * Returns the value of the '<em><b>Fuel Allocation Start Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Allocation Start Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Allocation Start Date</em>' attribute.
     * @see #isSetFuelAllocationStartDate()
     * @see #unsetFuelAllocationStartDate()
     * @see #setFuelAllocationStartDate(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelAllocationSchedule_FuelAllocationStartDate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FuelAllocationSchedule.fuelAllocationStartDate' kind='element'"
     * @generated
     */
    Date getFuelAllocationStartDate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Allocation Start Date</em>' attribute.
     * @see #isSetFuelAllocationStartDate()
     * @see #unsetFuelAllocationStartDate()
     * @see #getFuelAllocationStartDate()
     * @generated
     */
    void setFuelAllocationStartDate( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelAllocationStartDate()
     * @see #getFuelAllocationStartDate()
     * @see #setFuelAllocationStartDate(Date)
     * @generated
     */
    void unsetFuelAllocationStartDate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelAllocationStartDate <em>Fuel Allocation Start Date</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Allocation Start Date</em>' attribute is set.
     * @see #unsetFuelAllocationStartDate()
     * @see #getFuelAllocationStartDate()
     * @see #setFuelAllocationStartDate(Date)
     * @generated
     */
    boolean isSetFuelAllocationStartDate();

    /**
     * Returns the value of the '<em><b>Fuel Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fuel Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fuel Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType
     * @see #isSetFuelType()
     * @see #unsetFuelType()
     * @see #setFuelType(FuelType)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelAllocationSchedule_FuelType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FuelAllocationSchedule.fuelType' kind='element'"
     * @generated
     */
    FuelType getFuelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fuel Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType
     * @see #isSetFuelType()
     * @see #unsetFuelType()
     * @see #getFuelType()
     * @generated
     */
    void setFuelType( FuelType value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFuelType()
     * @see #getFuelType()
     * @see #setFuelType(FuelType)
     * @generated
     */
    void unsetFuelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFuelType <em>Fuel Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fuel Type</em>' attribute is set.
     * @see #unsetFuelType()
     * @see #getFuelType()
     * @see #setFuelType(FuelType)
     * @generated
     */
    boolean isSetFuelType();

    /**
     * Returns the value of the '<em><b>Max Fuel Allocation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Fuel Allocation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Fuel Allocation</em>' attribute.
     * @see #isSetMaxFuelAllocation()
     * @see #unsetMaxFuelAllocation()
     * @see #setMaxFuelAllocation(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelAllocationSchedule_MaxFuelAllocation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FuelAllocationSchedule.maxFuelAllocation' kind='element'"
     * @generated
     */
    Float getMaxFuelAllocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Fuel Allocation</em>' attribute.
     * @see #isSetMaxFuelAllocation()
     * @see #unsetMaxFuelAllocation()
     * @see #getMaxFuelAllocation()
     * @generated
     */
    void setMaxFuelAllocation( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxFuelAllocation()
     * @see #getMaxFuelAllocation()
     * @see #setMaxFuelAllocation(Float)
     * @generated
     */
    void unsetMaxFuelAllocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getMaxFuelAllocation <em>Max Fuel Allocation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Fuel Allocation</em>' attribute is set.
     * @see #unsetMaxFuelAllocation()
     * @see #getMaxFuelAllocation()
     * @see #setMaxFuelAllocation(Float)
     * @generated
     */
    boolean isSetMaxFuelAllocation();

    /**
     * Returns the value of the '<em><b>Min Fuel Allocation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Fuel Allocation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Fuel Allocation</em>' attribute.
     * @see #isSetMinFuelAllocation()
     * @see #unsetMinFuelAllocation()
     * @see #setMinFuelAllocation(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelAllocationSchedule_MinFuelAllocation()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FuelAllocationSchedule.minFuelAllocation' kind='element'"
     * @generated
     */
    Float getMinFuelAllocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Fuel Allocation</em>' attribute.
     * @see #isSetMinFuelAllocation()
     * @see #unsetMinFuelAllocation()
     * @see #getMinFuelAllocation()
     * @generated
     */
    void setMinFuelAllocation( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinFuelAllocation()
     * @see #getMinFuelAllocation()
     * @see #setMinFuelAllocation(Float)
     * @generated
     */
    void unsetMinFuelAllocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getMinFuelAllocation <em>Min Fuel Allocation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Fuel Allocation</em>' attribute is set.
     * @see #unsetMinFuelAllocation()
     * @see #getMinFuelAllocation()
     * @see #setMinFuelAllocation(Float)
     * @generated
     */
    boolean isSetMinFuelAllocation();

    /**
     * Returns the value of the '<em><b>Thermal Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelAllocationSchedule_ThermalGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit#getFuelAllocationSchedules
     * @model opposite="FuelAllocationSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FuelAllocationSchedule.ThermalGeneratingUnit' kind='element'"
     * @generated
     */
    ThermalGeneratingUnit getThermalGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    void unsetThermalGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thermal Generating Unit</em>' reference is set.
     * @see #unsetThermalGeneratingUnit()
     * @see #getThermalGeneratingUnit()
     * @see #setThermalGeneratingUnit(ThermalGeneratingUnit)
     * @generated
     */
    boolean isSetThermalGeneratingUnit();

    /**
     * Returns the value of the '<em><b>Fossil Fuel</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fossil Fuel</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fossil Fuel</em>' reference.
     * @see #isSetFossilFuel()
     * @see #unsetFossilFuel()
     * @see #setFossilFuel(FossilFuel)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getFuelAllocationSchedule_FossilFuel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel#getFuelAllocationSchedules
     * @model opposite="FuelAllocationSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='FuelAllocationSchedule.FossilFuel' kind='element'"
     * @generated
     */
    FossilFuel getFossilFuel();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fossil Fuel</em>' reference.
     * @see #isSetFossilFuel()
     * @see #unsetFossilFuel()
     * @see #getFossilFuel()
     * @generated
     */
    void setFossilFuel( FossilFuel value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFossilFuel()
     * @see #getFossilFuel()
     * @see #setFossilFuel(FossilFuel)
     * @generated
     */
    void unsetFossilFuel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule#getFossilFuel <em>Fossil Fuel</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fossil Fuel</em>' reference is set.
     * @see #unsetFossilFuel()
     * @see #getFossilFuel()
     * @see #setFossilFuel(FossilFuel)
     * @generated
     */
    boolean isSetFossilFuel();

} // FuelAllocationSchedule
