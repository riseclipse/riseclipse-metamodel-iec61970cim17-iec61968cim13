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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlled Appliance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsElectricVehicle <em>Is Electric Vehicle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsExteriorLighting <em>Is Exterior Lighting</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsGenerationSystem <em>Is Generation System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsHvacCompressorOrFurnace <em>Is Hvac Compressor Or Furnace</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsInteriorLighting <em>Is Interior Lighting</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsIrrigationPump <em>Is Irrigation Pump</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsManagedCommercialIndustrialLoad <em>Is Managed Commercial Industrial Load</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsPoolPumpSpaJacuzzi <em>Is Pool Pump Spa Jacuzzi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsSimpleMiscLoad <em>Is Simple Misc Load</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsSmartAppliance <em>Is Smart Appliance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsStripAndBaseboardHeater <em>Is Strip And Baseboard Heater</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsWaterHeater <em>Is Water Heater</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance()
 * @model
 * @generated
 */
public interface ControlledAppliance extends EObject {
    /**
     * Returns the value of the '<em><b>Is Electric Vehicle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Electric Vehicle</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Electric Vehicle</em>' attribute.
     * @see #isSetIsElectricVehicle()
     * @see #unsetIsElectricVehicle()
     * @see #setIsElectricVehicle(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsElectricVehicle()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isElectricVehicle' kind='element'"
     * @generated
     */
    Boolean getIsElectricVehicle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsElectricVehicle <em>Is Electric Vehicle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Electric Vehicle</em>' attribute.
     * @see #isSetIsElectricVehicle()
     * @see #unsetIsElectricVehicle()
     * @see #getIsElectricVehicle()
     * @generated
     */
    void setIsElectricVehicle( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsElectricVehicle <em>Is Electric Vehicle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsElectricVehicle()
     * @see #getIsElectricVehicle()
     * @see #setIsElectricVehicle(Boolean)
     * @generated
     */
    void unsetIsElectricVehicle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsElectricVehicle <em>Is Electric Vehicle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Electric Vehicle</em>' attribute is set.
     * @see #unsetIsElectricVehicle()
     * @see #getIsElectricVehicle()
     * @see #setIsElectricVehicle(Boolean)
     * @generated
     */
    boolean isSetIsElectricVehicle();

    /**
     * Returns the value of the '<em><b>Is Exterior Lighting</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Exterior Lighting</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Exterior Lighting</em>' attribute.
     * @see #isSetIsExteriorLighting()
     * @see #unsetIsExteriorLighting()
     * @see #setIsExteriorLighting(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsExteriorLighting()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isExteriorLighting' kind='element'"
     * @generated
     */
    Boolean getIsExteriorLighting();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsExteriorLighting <em>Is Exterior Lighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Exterior Lighting</em>' attribute.
     * @see #isSetIsExteriorLighting()
     * @see #unsetIsExteriorLighting()
     * @see #getIsExteriorLighting()
     * @generated
     */
    void setIsExteriorLighting( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsExteriorLighting <em>Is Exterior Lighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsExteriorLighting()
     * @see #getIsExteriorLighting()
     * @see #setIsExteriorLighting(Boolean)
     * @generated
     */
    void unsetIsExteriorLighting();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsExteriorLighting <em>Is Exterior Lighting</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Exterior Lighting</em>' attribute is set.
     * @see #unsetIsExteriorLighting()
     * @see #getIsExteriorLighting()
     * @see #setIsExteriorLighting(Boolean)
     * @generated
     */
    boolean isSetIsExteriorLighting();

    /**
     * Returns the value of the '<em><b>Is Generation System</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Generation System</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Generation System</em>' attribute.
     * @see #isSetIsGenerationSystem()
     * @see #unsetIsGenerationSystem()
     * @see #setIsGenerationSystem(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsGenerationSystem()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isGenerationSystem' kind='element'"
     * @generated
     */
    Boolean getIsGenerationSystem();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsGenerationSystem <em>Is Generation System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Generation System</em>' attribute.
     * @see #isSetIsGenerationSystem()
     * @see #unsetIsGenerationSystem()
     * @see #getIsGenerationSystem()
     * @generated
     */
    void setIsGenerationSystem( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsGenerationSystem <em>Is Generation System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsGenerationSystem()
     * @see #getIsGenerationSystem()
     * @see #setIsGenerationSystem(Boolean)
     * @generated
     */
    void unsetIsGenerationSystem();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsGenerationSystem <em>Is Generation System</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Generation System</em>' attribute is set.
     * @see #unsetIsGenerationSystem()
     * @see #getIsGenerationSystem()
     * @see #setIsGenerationSystem(Boolean)
     * @generated
     */
    boolean isSetIsGenerationSystem();

    /**
     * Returns the value of the '<em><b>Is Hvac Compressor Or Furnace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Hvac Compressor Or Furnace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Hvac Compressor Or Furnace</em>' attribute.
     * @see #isSetIsHvacCompressorOrFurnace()
     * @see #unsetIsHvacCompressorOrFurnace()
     * @see #setIsHvacCompressorOrFurnace(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsHvacCompressorOrFurnace()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isHvacCompressorOrFurnace' kind='element'"
     * @generated
     */
    Boolean getIsHvacCompressorOrFurnace();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsHvacCompressorOrFurnace <em>Is Hvac Compressor Or Furnace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Hvac Compressor Or Furnace</em>' attribute.
     * @see #isSetIsHvacCompressorOrFurnace()
     * @see #unsetIsHvacCompressorOrFurnace()
     * @see #getIsHvacCompressorOrFurnace()
     * @generated
     */
    void setIsHvacCompressorOrFurnace( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsHvacCompressorOrFurnace <em>Is Hvac Compressor Or Furnace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsHvacCompressorOrFurnace()
     * @see #getIsHvacCompressorOrFurnace()
     * @see #setIsHvacCompressorOrFurnace(Boolean)
     * @generated
     */
    void unsetIsHvacCompressorOrFurnace();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsHvacCompressorOrFurnace <em>Is Hvac Compressor Or Furnace</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Hvac Compressor Or Furnace</em>' attribute is set.
     * @see #unsetIsHvacCompressorOrFurnace()
     * @see #getIsHvacCompressorOrFurnace()
     * @see #setIsHvacCompressorOrFurnace(Boolean)
     * @generated
     */
    boolean isSetIsHvacCompressorOrFurnace();

    /**
     * Returns the value of the '<em><b>Is Interior Lighting</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Interior Lighting</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Interior Lighting</em>' attribute.
     * @see #isSetIsInteriorLighting()
     * @see #unsetIsInteriorLighting()
     * @see #setIsInteriorLighting(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsInteriorLighting()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isInteriorLighting' kind='element'"
     * @generated
     */
    Boolean getIsInteriorLighting();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsInteriorLighting <em>Is Interior Lighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Interior Lighting</em>' attribute.
     * @see #isSetIsInteriorLighting()
     * @see #unsetIsInteriorLighting()
     * @see #getIsInteriorLighting()
     * @generated
     */
    void setIsInteriorLighting( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsInteriorLighting <em>Is Interior Lighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsInteriorLighting()
     * @see #getIsInteriorLighting()
     * @see #setIsInteriorLighting(Boolean)
     * @generated
     */
    void unsetIsInteriorLighting();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsInteriorLighting <em>Is Interior Lighting</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Interior Lighting</em>' attribute is set.
     * @see #unsetIsInteriorLighting()
     * @see #getIsInteriorLighting()
     * @see #setIsInteriorLighting(Boolean)
     * @generated
     */
    boolean isSetIsInteriorLighting();

    /**
     * Returns the value of the '<em><b>Is Irrigation Pump</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Irrigation Pump</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Irrigation Pump</em>' attribute.
     * @see #isSetIsIrrigationPump()
     * @see #unsetIsIrrigationPump()
     * @see #setIsIrrigationPump(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsIrrigationPump()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isIrrigationPump' kind='element'"
     * @generated
     */
    Boolean getIsIrrigationPump();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsIrrigationPump <em>Is Irrigation Pump</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Irrigation Pump</em>' attribute.
     * @see #isSetIsIrrigationPump()
     * @see #unsetIsIrrigationPump()
     * @see #getIsIrrigationPump()
     * @generated
     */
    void setIsIrrigationPump( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsIrrigationPump <em>Is Irrigation Pump</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsIrrigationPump()
     * @see #getIsIrrigationPump()
     * @see #setIsIrrigationPump(Boolean)
     * @generated
     */
    void unsetIsIrrigationPump();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsIrrigationPump <em>Is Irrigation Pump</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Irrigation Pump</em>' attribute is set.
     * @see #unsetIsIrrigationPump()
     * @see #getIsIrrigationPump()
     * @see #setIsIrrigationPump(Boolean)
     * @generated
     */
    boolean isSetIsIrrigationPump();

    /**
     * Returns the value of the '<em><b>Is Managed Commercial Industrial Load</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Managed Commercial Industrial Load</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Managed Commercial Industrial Load</em>' attribute.
     * @see #isSetIsManagedCommercialIndustrialLoad()
     * @see #unsetIsManagedCommercialIndustrialLoad()
     * @see #setIsManagedCommercialIndustrialLoad(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsManagedCommercialIndustrialLoad()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isManagedCommercialIndustrialLoad' kind='element'"
     * @generated
     */
    Boolean getIsManagedCommercialIndustrialLoad();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsManagedCommercialIndustrialLoad <em>Is Managed Commercial Industrial Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Managed Commercial Industrial Load</em>' attribute.
     * @see #isSetIsManagedCommercialIndustrialLoad()
     * @see #unsetIsManagedCommercialIndustrialLoad()
     * @see #getIsManagedCommercialIndustrialLoad()
     * @generated
     */
    void setIsManagedCommercialIndustrialLoad( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsManagedCommercialIndustrialLoad <em>Is Managed Commercial Industrial Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsManagedCommercialIndustrialLoad()
     * @see #getIsManagedCommercialIndustrialLoad()
     * @see #setIsManagedCommercialIndustrialLoad(Boolean)
     * @generated
     */
    void unsetIsManagedCommercialIndustrialLoad();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsManagedCommercialIndustrialLoad <em>Is Managed Commercial Industrial Load</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Managed Commercial Industrial Load</em>' attribute is set.
     * @see #unsetIsManagedCommercialIndustrialLoad()
     * @see #getIsManagedCommercialIndustrialLoad()
     * @see #setIsManagedCommercialIndustrialLoad(Boolean)
     * @generated
     */
    boolean isSetIsManagedCommercialIndustrialLoad();

    /**
     * Returns the value of the '<em><b>Is Pool Pump Spa Jacuzzi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Pool Pump Spa Jacuzzi</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Pool Pump Spa Jacuzzi</em>' attribute.
     * @see #isSetIsPoolPumpSpaJacuzzi()
     * @see #unsetIsPoolPumpSpaJacuzzi()
     * @see #setIsPoolPumpSpaJacuzzi(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsPoolPumpSpaJacuzzi()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isPoolPumpSpaJacuzzi' kind='element'"
     * @generated
     */
    Boolean getIsPoolPumpSpaJacuzzi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsPoolPumpSpaJacuzzi <em>Is Pool Pump Spa Jacuzzi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Pool Pump Spa Jacuzzi</em>' attribute.
     * @see #isSetIsPoolPumpSpaJacuzzi()
     * @see #unsetIsPoolPumpSpaJacuzzi()
     * @see #getIsPoolPumpSpaJacuzzi()
     * @generated
     */
    void setIsPoolPumpSpaJacuzzi( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsPoolPumpSpaJacuzzi <em>Is Pool Pump Spa Jacuzzi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPoolPumpSpaJacuzzi()
     * @see #getIsPoolPumpSpaJacuzzi()
     * @see #setIsPoolPumpSpaJacuzzi(Boolean)
     * @generated
     */
    void unsetIsPoolPumpSpaJacuzzi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsPoolPumpSpaJacuzzi <em>Is Pool Pump Spa Jacuzzi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Pool Pump Spa Jacuzzi</em>' attribute is set.
     * @see #unsetIsPoolPumpSpaJacuzzi()
     * @see #getIsPoolPumpSpaJacuzzi()
     * @see #setIsPoolPumpSpaJacuzzi(Boolean)
     * @generated
     */
    boolean isSetIsPoolPumpSpaJacuzzi();

    /**
     * Returns the value of the '<em><b>Is Simple Misc Load</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Simple Misc Load</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Simple Misc Load</em>' attribute.
     * @see #isSetIsSimpleMiscLoad()
     * @see #unsetIsSimpleMiscLoad()
     * @see #setIsSimpleMiscLoad(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsSimpleMiscLoad()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isSimpleMiscLoad' kind='element'"
     * @generated
     */
    Boolean getIsSimpleMiscLoad();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsSimpleMiscLoad <em>Is Simple Misc Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Simple Misc Load</em>' attribute.
     * @see #isSetIsSimpleMiscLoad()
     * @see #unsetIsSimpleMiscLoad()
     * @see #getIsSimpleMiscLoad()
     * @generated
     */
    void setIsSimpleMiscLoad( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsSimpleMiscLoad <em>Is Simple Misc Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsSimpleMiscLoad()
     * @see #getIsSimpleMiscLoad()
     * @see #setIsSimpleMiscLoad(Boolean)
     * @generated
     */
    void unsetIsSimpleMiscLoad();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsSimpleMiscLoad <em>Is Simple Misc Load</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Simple Misc Load</em>' attribute is set.
     * @see #unsetIsSimpleMiscLoad()
     * @see #getIsSimpleMiscLoad()
     * @see #setIsSimpleMiscLoad(Boolean)
     * @generated
     */
    boolean isSetIsSimpleMiscLoad();

    /**
     * Returns the value of the '<em><b>Is Smart Appliance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Smart Appliance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Smart Appliance</em>' attribute.
     * @see #isSetIsSmartAppliance()
     * @see #unsetIsSmartAppliance()
     * @see #setIsSmartAppliance(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsSmartAppliance()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isSmartAppliance' kind='element'"
     * @generated
     */
    Boolean getIsSmartAppliance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsSmartAppliance <em>Is Smart Appliance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Smart Appliance</em>' attribute.
     * @see #isSetIsSmartAppliance()
     * @see #unsetIsSmartAppliance()
     * @see #getIsSmartAppliance()
     * @generated
     */
    void setIsSmartAppliance( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsSmartAppliance <em>Is Smart Appliance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsSmartAppliance()
     * @see #getIsSmartAppliance()
     * @see #setIsSmartAppliance(Boolean)
     * @generated
     */
    void unsetIsSmartAppliance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsSmartAppliance <em>Is Smart Appliance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Smart Appliance</em>' attribute is set.
     * @see #unsetIsSmartAppliance()
     * @see #getIsSmartAppliance()
     * @see #setIsSmartAppliance(Boolean)
     * @generated
     */
    boolean isSetIsSmartAppliance();

    /**
     * Returns the value of the '<em><b>Is Strip And Baseboard Heater</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Strip And Baseboard Heater</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Strip And Baseboard Heater</em>' attribute.
     * @see #isSetIsStripAndBaseboardHeater()
     * @see #unsetIsStripAndBaseboardHeater()
     * @see #setIsStripAndBaseboardHeater(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsStripAndBaseboardHeater()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isStripAndBaseboardHeater' kind='element'"
     * @generated
     */
    Boolean getIsStripAndBaseboardHeater();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsStripAndBaseboardHeater <em>Is Strip And Baseboard Heater</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Strip And Baseboard Heater</em>' attribute.
     * @see #isSetIsStripAndBaseboardHeater()
     * @see #unsetIsStripAndBaseboardHeater()
     * @see #getIsStripAndBaseboardHeater()
     * @generated
     */
    void setIsStripAndBaseboardHeater( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsStripAndBaseboardHeater <em>Is Strip And Baseboard Heater</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsStripAndBaseboardHeater()
     * @see #getIsStripAndBaseboardHeater()
     * @see #setIsStripAndBaseboardHeater(Boolean)
     * @generated
     */
    void unsetIsStripAndBaseboardHeater();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsStripAndBaseboardHeater <em>Is Strip And Baseboard Heater</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Strip And Baseboard Heater</em>' attribute is set.
     * @see #unsetIsStripAndBaseboardHeater()
     * @see #getIsStripAndBaseboardHeater()
     * @see #setIsStripAndBaseboardHeater(Boolean)
     * @generated
     */
    boolean isSetIsStripAndBaseboardHeater();

    /**
     * Returns the value of the '<em><b>Is Water Heater</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Water Heater</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Water Heater</em>' attribute.
     * @see #isSetIsWaterHeater()
     * @see #unsetIsWaterHeater()
     * @see #setIsWaterHeater(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControlledAppliance_IsWaterHeater()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ControlledAppliance.isWaterHeater' kind='element'"
     * @generated
     */
    Boolean getIsWaterHeater();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsWaterHeater <em>Is Water Heater</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Water Heater</em>' attribute.
     * @see #isSetIsWaterHeater()
     * @see #unsetIsWaterHeater()
     * @see #getIsWaterHeater()
     * @generated
     */
    void setIsWaterHeater( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsWaterHeater <em>Is Water Heater</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsWaterHeater()
     * @see #getIsWaterHeater()
     * @see #setIsWaterHeater(Boolean)
     * @generated
     */
    void unsetIsWaterHeater();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance#getIsWaterHeater <em>Is Water Heater</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Water Heater</em>' attribute is set.
     * @see #unsetIsWaterHeater()
     * @see #getIsWaterHeater()
     * @see #setIsWaterHeater(Boolean)
     * @generated
     */
    boolean isSetIsWaterHeater();

} // ControlledAppliance
