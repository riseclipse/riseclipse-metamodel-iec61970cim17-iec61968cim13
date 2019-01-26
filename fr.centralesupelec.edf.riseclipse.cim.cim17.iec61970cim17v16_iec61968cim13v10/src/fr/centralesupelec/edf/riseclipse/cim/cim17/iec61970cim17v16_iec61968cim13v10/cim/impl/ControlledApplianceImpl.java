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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlled Appliance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsElectricVehicle <em>Is Electric Vehicle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsExteriorLighting <em>Is Exterior Lighting</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsGenerationSystem <em>Is Generation System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsHvacCompressorOrFurnace <em>Is Hvac Compressor Or Furnace</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsInteriorLighting <em>Is Interior Lighting</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsIrrigationPump <em>Is Irrigation Pump</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsManagedCommercialIndustrialLoad <em>Is Managed Commercial Industrial Load</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsPoolPumpSpaJacuzzi <em>Is Pool Pump Spa Jacuzzi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsSimpleMiscLoad <em>Is Simple Misc Load</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsSmartAppliance <em>Is Smart Appliance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsStripAndBaseboardHeater <em>Is Strip And Baseboard Heater</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ControlledApplianceImpl#getIsWaterHeater <em>Is Water Heater</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlledApplianceImpl extends MinimalEObjectImpl.Container implements ControlledAppliance {
    /**
     * The default value of the '{@link #getIsElectricVehicle() <em>Is Electric Vehicle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsElectricVehicle()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_ELECTRIC_VEHICLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsElectricVehicle() <em>Is Electric Vehicle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsElectricVehicle()
     * @generated
     * @ordered
     */
    protected Boolean isElectricVehicle = IS_ELECTRIC_VEHICLE_EDEFAULT;

    /**
     * This is true if the Is Electric Vehicle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isElectricVehicleESet;

    /**
     * The default value of the '{@link #getIsExteriorLighting() <em>Is Exterior Lighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsExteriorLighting()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_EXTERIOR_LIGHTING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsExteriorLighting() <em>Is Exterior Lighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsExteriorLighting()
     * @generated
     * @ordered
     */
    protected Boolean isExteriorLighting = IS_EXTERIOR_LIGHTING_EDEFAULT;

    /**
     * This is true if the Is Exterior Lighting attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isExteriorLightingESet;

    /**
     * The default value of the '{@link #getIsGenerationSystem() <em>Is Generation System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsGenerationSystem()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_GENERATION_SYSTEM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsGenerationSystem() <em>Is Generation System</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsGenerationSystem()
     * @generated
     * @ordered
     */
    protected Boolean isGenerationSystem = IS_GENERATION_SYSTEM_EDEFAULT;

    /**
     * This is true if the Is Generation System attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isGenerationSystemESet;

    /**
     * The default value of the '{@link #getIsHvacCompressorOrFurnace() <em>Is Hvac Compressor Or Furnace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsHvacCompressorOrFurnace()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_HVAC_COMPRESSOR_OR_FURNACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsHvacCompressorOrFurnace() <em>Is Hvac Compressor Or Furnace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsHvacCompressorOrFurnace()
     * @generated
     * @ordered
     */
    protected Boolean isHvacCompressorOrFurnace = IS_HVAC_COMPRESSOR_OR_FURNACE_EDEFAULT;

    /**
     * This is true if the Is Hvac Compressor Or Furnace attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isHvacCompressorOrFurnaceESet;

    /**
     * The default value of the '{@link #getIsInteriorLighting() <em>Is Interior Lighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsInteriorLighting()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_INTERIOR_LIGHTING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsInteriorLighting() <em>Is Interior Lighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsInteriorLighting()
     * @generated
     * @ordered
     */
    protected Boolean isInteriorLighting = IS_INTERIOR_LIGHTING_EDEFAULT;

    /**
     * This is true if the Is Interior Lighting attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isInteriorLightingESet;

    /**
     * The default value of the '{@link #getIsIrrigationPump() <em>Is Irrigation Pump</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsIrrigationPump()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_IRRIGATION_PUMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsIrrigationPump() <em>Is Irrigation Pump</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsIrrigationPump()
     * @generated
     * @ordered
     */
    protected Boolean isIrrigationPump = IS_IRRIGATION_PUMP_EDEFAULT;

    /**
     * This is true if the Is Irrigation Pump attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isIrrigationPumpESet;

    /**
     * The default value of the '{@link #getIsManagedCommercialIndustrialLoad() <em>Is Managed Commercial Industrial Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsManagedCommercialIndustrialLoad()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsManagedCommercialIndustrialLoad() <em>Is Managed Commercial Industrial Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsManagedCommercialIndustrialLoad()
     * @generated
     * @ordered
     */
    protected Boolean isManagedCommercialIndustrialLoad = IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD_EDEFAULT;

    /**
     * This is true if the Is Managed Commercial Industrial Load attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isManagedCommercialIndustrialLoadESet;

    /**
     * The default value of the '{@link #getIsPoolPumpSpaJacuzzi() <em>Is Pool Pump Spa Jacuzzi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPoolPumpSpaJacuzzi()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_POOL_PUMP_SPA_JACUZZI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsPoolPumpSpaJacuzzi() <em>Is Pool Pump Spa Jacuzzi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPoolPumpSpaJacuzzi()
     * @generated
     * @ordered
     */
    protected Boolean isPoolPumpSpaJacuzzi = IS_POOL_PUMP_SPA_JACUZZI_EDEFAULT;

    /**
     * This is true if the Is Pool Pump Spa Jacuzzi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPoolPumpSpaJacuzziESet;

    /**
     * The default value of the '{@link #getIsSimpleMiscLoad() <em>Is Simple Misc Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSimpleMiscLoad()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SIMPLE_MISC_LOAD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsSimpleMiscLoad() <em>Is Simple Misc Load</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSimpleMiscLoad()
     * @generated
     * @ordered
     */
    protected Boolean isSimpleMiscLoad = IS_SIMPLE_MISC_LOAD_EDEFAULT;

    /**
     * This is true if the Is Simple Misc Load attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSimpleMiscLoadESet;

    /**
     * The default value of the '{@link #getIsSmartAppliance() <em>Is Smart Appliance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSmartAppliance()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_SMART_APPLIANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsSmartAppliance() <em>Is Smart Appliance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsSmartAppliance()
     * @generated
     * @ordered
     */
    protected Boolean isSmartAppliance = IS_SMART_APPLIANCE_EDEFAULT;

    /**
     * This is true if the Is Smart Appliance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSmartApplianceESet;

    /**
     * The default value of the '{@link #getIsStripAndBaseboardHeater() <em>Is Strip And Baseboard Heater</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsStripAndBaseboardHeater()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_STRIP_AND_BASEBOARD_HEATER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsStripAndBaseboardHeater() <em>Is Strip And Baseboard Heater</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsStripAndBaseboardHeater()
     * @generated
     * @ordered
     */
    protected Boolean isStripAndBaseboardHeater = IS_STRIP_AND_BASEBOARD_HEATER_EDEFAULT;

    /**
     * This is true if the Is Strip And Baseboard Heater attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isStripAndBaseboardHeaterESet;

    /**
     * The default value of the '{@link #getIsWaterHeater() <em>Is Water Heater</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsWaterHeater()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_WATER_HEATER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsWaterHeater() <em>Is Water Heater</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsWaterHeater()
     * @generated
     * @ordered
     */
    protected Boolean isWaterHeater = IS_WATER_HEATER_EDEFAULT;

    /**
     * This is true if the Is Water Heater attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isWaterHeaterESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ControlledApplianceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getControlledAppliance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsElectricVehicle() {
        return isElectricVehicle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsElectricVehicle( Boolean newIsElectricVehicle ) {
        Boolean oldIsElectricVehicle = isElectricVehicle;
        isElectricVehicle = newIsElectricVehicle;
        boolean oldIsElectricVehicleESet = isElectricVehicleESet;
        isElectricVehicleESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CONTROLLED_APPLIANCE__IS_ELECTRIC_VEHICLE,
                        oldIsElectricVehicle, isElectricVehicle, !oldIsElectricVehicleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsElectricVehicle() {
        Boolean oldIsElectricVehicle = isElectricVehicle;
        boolean oldIsElectricVehicleESet = isElectricVehicleESet;
        isElectricVehicle = IS_ELECTRIC_VEHICLE_EDEFAULT;
        isElectricVehicleESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROLLED_APPLIANCE__IS_ELECTRIC_VEHICLE,
                        oldIsElectricVehicle, IS_ELECTRIC_VEHICLE_EDEFAULT, oldIsElectricVehicleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsElectricVehicle() {
        return isElectricVehicleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsExteriorLighting() {
        return isExteriorLighting;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsExteriorLighting( Boolean newIsExteriorLighting ) {
        Boolean oldIsExteriorLighting = isExteriorLighting;
        isExteriorLighting = newIsExteriorLighting;
        boolean oldIsExteriorLightingESet = isExteriorLightingESet;
        isExteriorLightingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CONTROLLED_APPLIANCE__IS_EXTERIOR_LIGHTING,
                        oldIsExteriorLighting, isExteriorLighting, !oldIsExteriorLightingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsExteriorLighting() {
        Boolean oldIsExteriorLighting = isExteriorLighting;
        boolean oldIsExteriorLightingESet = isExteriorLightingESet;
        isExteriorLighting = IS_EXTERIOR_LIGHTING_EDEFAULT;
        isExteriorLightingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROLLED_APPLIANCE__IS_EXTERIOR_LIGHTING,
                        oldIsExteriorLighting, IS_EXTERIOR_LIGHTING_EDEFAULT, oldIsExteriorLightingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsExteriorLighting() {
        return isExteriorLightingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsGenerationSystem() {
        return isGenerationSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsGenerationSystem( Boolean newIsGenerationSystem ) {
        Boolean oldIsGenerationSystem = isGenerationSystem;
        isGenerationSystem = newIsGenerationSystem;
        boolean oldIsGenerationSystemESet = isGenerationSystemESet;
        isGenerationSystemESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CONTROLLED_APPLIANCE__IS_GENERATION_SYSTEM,
                        oldIsGenerationSystem, isGenerationSystem, !oldIsGenerationSystemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsGenerationSystem() {
        Boolean oldIsGenerationSystem = isGenerationSystem;
        boolean oldIsGenerationSystemESet = isGenerationSystemESet;
        isGenerationSystem = IS_GENERATION_SYSTEM_EDEFAULT;
        isGenerationSystemESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROLLED_APPLIANCE__IS_GENERATION_SYSTEM,
                        oldIsGenerationSystem, IS_GENERATION_SYSTEM_EDEFAULT, oldIsGenerationSystemESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsGenerationSystem() {
        return isGenerationSystemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsHvacCompressorOrFurnace() {
        return isHvacCompressorOrFurnace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsHvacCompressorOrFurnace( Boolean newIsHvacCompressorOrFurnace ) {
        Boolean oldIsHvacCompressorOrFurnace = isHvacCompressorOrFurnace;
        isHvacCompressorOrFurnace = newIsHvacCompressorOrFurnace;
        boolean oldIsHvacCompressorOrFurnaceESet = isHvacCompressorOrFurnaceESet;
        isHvacCompressorOrFurnaceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROLLED_APPLIANCE__IS_HVAC_COMPRESSOR_OR_FURNACE, oldIsHvacCompressorOrFurnace,
                isHvacCompressorOrFurnace, !oldIsHvacCompressorOrFurnaceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsHvacCompressorOrFurnace() {
        Boolean oldIsHvacCompressorOrFurnace = isHvacCompressorOrFurnace;
        boolean oldIsHvacCompressorOrFurnaceESet = isHvacCompressorOrFurnaceESet;
        isHvacCompressorOrFurnace = IS_HVAC_COMPRESSOR_OR_FURNACE_EDEFAULT;
        isHvacCompressorOrFurnaceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROLLED_APPLIANCE__IS_HVAC_COMPRESSOR_OR_FURNACE, oldIsHvacCompressorOrFurnace,
                IS_HVAC_COMPRESSOR_OR_FURNACE_EDEFAULT, oldIsHvacCompressorOrFurnaceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsHvacCompressorOrFurnace() {
        return isHvacCompressorOrFurnaceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsInteriorLighting() {
        return isInteriorLighting;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsInteriorLighting( Boolean newIsInteriorLighting ) {
        Boolean oldIsInteriorLighting = isInteriorLighting;
        isInteriorLighting = newIsInteriorLighting;
        boolean oldIsInteriorLightingESet = isInteriorLightingESet;
        isInteriorLightingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CONTROLLED_APPLIANCE__IS_INTERIOR_LIGHTING,
                        oldIsInteriorLighting, isInteriorLighting, !oldIsInteriorLightingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsInteriorLighting() {
        Boolean oldIsInteriorLighting = isInteriorLighting;
        boolean oldIsInteriorLightingESet = isInteriorLightingESet;
        isInteriorLighting = IS_INTERIOR_LIGHTING_EDEFAULT;
        isInteriorLightingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROLLED_APPLIANCE__IS_INTERIOR_LIGHTING,
                        oldIsInteriorLighting, IS_INTERIOR_LIGHTING_EDEFAULT, oldIsInteriorLightingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsInteriorLighting() {
        return isInteriorLightingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsIrrigationPump() {
        return isIrrigationPump;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsIrrigationPump( Boolean newIsIrrigationPump ) {
        Boolean oldIsIrrigationPump = isIrrigationPump;
        isIrrigationPump = newIsIrrigationPump;
        boolean oldIsIrrigationPumpESet = isIrrigationPumpESet;
        isIrrigationPumpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONTROLLED_APPLIANCE__IS_IRRIGATION_PUMP,
                    oldIsIrrigationPump, isIrrigationPump, !oldIsIrrigationPumpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsIrrigationPump() {
        Boolean oldIsIrrigationPump = isIrrigationPump;
        boolean oldIsIrrigationPumpESet = isIrrigationPumpESet;
        isIrrigationPump = IS_IRRIGATION_PUMP_EDEFAULT;
        isIrrigationPumpESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROLLED_APPLIANCE__IS_IRRIGATION_PUMP,
                        oldIsIrrigationPump, IS_IRRIGATION_PUMP_EDEFAULT, oldIsIrrigationPumpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsIrrigationPump() {
        return isIrrigationPumpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsManagedCommercialIndustrialLoad() {
        return isManagedCommercialIndustrialLoad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsManagedCommercialIndustrialLoad( Boolean newIsManagedCommercialIndustrialLoad ) {
        Boolean oldIsManagedCommercialIndustrialLoad = isManagedCommercialIndustrialLoad;
        isManagedCommercialIndustrialLoad = newIsManagedCommercialIndustrialLoad;
        boolean oldIsManagedCommercialIndustrialLoadESet = isManagedCommercialIndustrialLoadESet;
        isManagedCommercialIndustrialLoadESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROLLED_APPLIANCE__IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD,
                oldIsManagedCommercialIndustrialLoad, isManagedCommercialIndustrialLoad,
                !oldIsManagedCommercialIndustrialLoadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsManagedCommercialIndustrialLoad() {
        Boolean oldIsManagedCommercialIndustrialLoad = isManagedCommercialIndustrialLoad;
        boolean oldIsManagedCommercialIndustrialLoadESet = isManagedCommercialIndustrialLoadESet;
        isManagedCommercialIndustrialLoad = IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD_EDEFAULT;
        isManagedCommercialIndustrialLoadESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROLLED_APPLIANCE__IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD,
                oldIsManagedCommercialIndustrialLoad, IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD_EDEFAULT,
                oldIsManagedCommercialIndustrialLoadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsManagedCommercialIndustrialLoad() {
        return isManagedCommercialIndustrialLoadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPoolPumpSpaJacuzzi() {
        return isPoolPumpSpaJacuzzi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPoolPumpSpaJacuzzi( Boolean newIsPoolPumpSpaJacuzzi ) {
        Boolean oldIsPoolPumpSpaJacuzzi = isPoolPumpSpaJacuzzi;
        isPoolPumpSpaJacuzzi = newIsPoolPumpSpaJacuzzi;
        boolean oldIsPoolPumpSpaJacuzziESet = isPoolPumpSpaJacuzziESet;
        isPoolPumpSpaJacuzziESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROLLED_APPLIANCE__IS_POOL_PUMP_SPA_JACUZZI, oldIsPoolPumpSpaJacuzzi,
                isPoolPumpSpaJacuzzi, !oldIsPoolPumpSpaJacuzziESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPoolPumpSpaJacuzzi() {
        Boolean oldIsPoolPumpSpaJacuzzi = isPoolPumpSpaJacuzzi;
        boolean oldIsPoolPumpSpaJacuzziESet = isPoolPumpSpaJacuzziESet;
        isPoolPumpSpaJacuzzi = IS_POOL_PUMP_SPA_JACUZZI_EDEFAULT;
        isPoolPumpSpaJacuzziESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROLLED_APPLIANCE__IS_POOL_PUMP_SPA_JACUZZI, oldIsPoolPumpSpaJacuzzi,
                IS_POOL_PUMP_SPA_JACUZZI_EDEFAULT, oldIsPoolPumpSpaJacuzziESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPoolPumpSpaJacuzzi() {
        return isPoolPumpSpaJacuzziESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsSimpleMiscLoad() {
        return isSimpleMiscLoad;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSimpleMiscLoad( Boolean newIsSimpleMiscLoad ) {
        Boolean oldIsSimpleMiscLoad = isSimpleMiscLoad;
        isSimpleMiscLoad = newIsSimpleMiscLoad;
        boolean oldIsSimpleMiscLoadESet = isSimpleMiscLoadESet;
        isSimpleMiscLoadESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.CONTROLLED_APPLIANCE__IS_SIMPLE_MISC_LOAD,
                        oldIsSimpleMiscLoad, isSimpleMiscLoad, !oldIsSimpleMiscLoadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSimpleMiscLoad() {
        Boolean oldIsSimpleMiscLoad = isSimpleMiscLoad;
        boolean oldIsSimpleMiscLoadESet = isSimpleMiscLoadESet;
        isSimpleMiscLoad = IS_SIMPLE_MISC_LOAD_EDEFAULT;
        isSimpleMiscLoadESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROLLED_APPLIANCE__IS_SIMPLE_MISC_LOAD,
                        oldIsSimpleMiscLoad, IS_SIMPLE_MISC_LOAD_EDEFAULT, oldIsSimpleMiscLoadESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSimpleMiscLoad() {
        return isSimpleMiscLoadESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsSmartAppliance() {
        return isSmartAppliance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsSmartAppliance( Boolean newIsSmartAppliance ) {
        Boolean oldIsSmartAppliance = isSmartAppliance;
        isSmartAppliance = newIsSmartAppliance;
        boolean oldIsSmartApplianceESet = isSmartApplianceESet;
        isSmartApplianceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONTROLLED_APPLIANCE__IS_SMART_APPLIANCE,
                    oldIsSmartAppliance, isSmartAppliance, !oldIsSmartApplianceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsSmartAppliance() {
        Boolean oldIsSmartAppliance = isSmartAppliance;
        boolean oldIsSmartApplianceESet = isSmartApplianceESet;
        isSmartAppliance = IS_SMART_APPLIANCE_EDEFAULT;
        isSmartApplianceESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROLLED_APPLIANCE__IS_SMART_APPLIANCE,
                        oldIsSmartAppliance, IS_SMART_APPLIANCE_EDEFAULT, oldIsSmartApplianceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsSmartAppliance() {
        return isSmartApplianceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsStripAndBaseboardHeater() {
        return isStripAndBaseboardHeater;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsStripAndBaseboardHeater( Boolean newIsStripAndBaseboardHeater ) {
        Boolean oldIsStripAndBaseboardHeater = isStripAndBaseboardHeater;
        isStripAndBaseboardHeater = newIsStripAndBaseboardHeater;
        boolean oldIsStripAndBaseboardHeaterESet = isStripAndBaseboardHeaterESet;
        isStripAndBaseboardHeaterESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CONTROLLED_APPLIANCE__IS_STRIP_AND_BASEBOARD_HEATER, oldIsStripAndBaseboardHeater,
                isStripAndBaseboardHeater, !oldIsStripAndBaseboardHeaterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsStripAndBaseboardHeater() {
        Boolean oldIsStripAndBaseboardHeater = isStripAndBaseboardHeater;
        boolean oldIsStripAndBaseboardHeaterESet = isStripAndBaseboardHeaterESet;
        isStripAndBaseboardHeater = IS_STRIP_AND_BASEBOARD_HEATER_EDEFAULT;
        isStripAndBaseboardHeaterESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CONTROLLED_APPLIANCE__IS_STRIP_AND_BASEBOARD_HEATER, oldIsStripAndBaseboardHeater,
                IS_STRIP_AND_BASEBOARD_HEATER_EDEFAULT, oldIsStripAndBaseboardHeaterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsStripAndBaseboardHeater() {
        return isStripAndBaseboardHeaterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsWaterHeater() {
        return isWaterHeater;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsWaterHeater( Boolean newIsWaterHeater ) {
        Boolean oldIsWaterHeater = isWaterHeater;
        isWaterHeater = newIsWaterHeater;
        boolean oldIsWaterHeaterESet = isWaterHeaterESet;
        isWaterHeaterESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONTROLLED_APPLIANCE__IS_WATER_HEATER,
                    oldIsWaterHeater, isWaterHeater, !oldIsWaterHeaterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsWaterHeater() {
        Boolean oldIsWaterHeater = isWaterHeater;
        boolean oldIsWaterHeaterESet = isWaterHeaterESet;
        isWaterHeater = IS_WATER_HEATER_EDEFAULT;
        isWaterHeaterESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CONTROLLED_APPLIANCE__IS_WATER_HEATER,
                    oldIsWaterHeater, IS_WATER_HEATER_EDEFAULT, oldIsWaterHeaterESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsWaterHeater() {
        return isWaterHeaterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CONTROLLED_APPLIANCE__IS_ELECTRIC_VEHICLE:
            return getIsElectricVehicle();
        case CimPackage.CONTROLLED_APPLIANCE__IS_EXTERIOR_LIGHTING:
            return getIsExteriorLighting();
        case CimPackage.CONTROLLED_APPLIANCE__IS_GENERATION_SYSTEM:
            return getIsGenerationSystem();
        case CimPackage.CONTROLLED_APPLIANCE__IS_HVAC_COMPRESSOR_OR_FURNACE:
            return getIsHvacCompressorOrFurnace();
        case CimPackage.CONTROLLED_APPLIANCE__IS_INTERIOR_LIGHTING:
            return getIsInteriorLighting();
        case CimPackage.CONTROLLED_APPLIANCE__IS_IRRIGATION_PUMP:
            return getIsIrrigationPump();
        case CimPackage.CONTROLLED_APPLIANCE__IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD:
            return getIsManagedCommercialIndustrialLoad();
        case CimPackage.CONTROLLED_APPLIANCE__IS_POOL_PUMP_SPA_JACUZZI:
            return getIsPoolPumpSpaJacuzzi();
        case CimPackage.CONTROLLED_APPLIANCE__IS_SIMPLE_MISC_LOAD:
            return getIsSimpleMiscLoad();
        case CimPackage.CONTROLLED_APPLIANCE__IS_SMART_APPLIANCE:
            return getIsSmartAppliance();
        case CimPackage.CONTROLLED_APPLIANCE__IS_STRIP_AND_BASEBOARD_HEATER:
            return getIsStripAndBaseboardHeater();
        case CimPackage.CONTROLLED_APPLIANCE__IS_WATER_HEATER:
            return getIsWaterHeater();
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
        case CimPackage.CONTROLLED_APPLIANCE__IS_ELECTRIC_VEHICLE:
            setIsElectricVehicle( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_EXTERIOR_LIGHTING:
            setIsExteriorLighting( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_GENERATION_SYSTEM:
            setIsGenerationSystem( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_HVAC_COMPRESSOR_OR_FURNACE:
            setIsHvacCompressorOrFurnace( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_INTERIOR_LIGHTING:
            setIsInteriorLighting( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_IRRIGATION_PUMP:
            setIsIrrigationPump( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD:
            setIsManagedCommercialIndustrialLoad( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_POOL_PUMP_SPA_JACUZZI:
            setIsPoolPumpSpaJacuzzi( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_SIMPLE_MISC_LOAD:
            setIsSimpleMiscLoad( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_SMART_APPLIANCE:
            setIsSmartAppliance( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_STRIP_AND_BASEBOARD_HEATER:
            setIsStripAndBaseboardHeater( ( Boolean ) newValue );
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_WATER_HEATER:
            setIsWaterHeater( ( Boolean ) newValue );
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
        case CimPackage.CONTROLLED_APPLIANCE__IS_ELECTRIC_VEHICLE:
            unsetIsElectricVehicle();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_EXTERIOR_LIGHTING:
            unsetIsExteriorLighting();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_GENERATION_SYSTEM:
            unsetIsGenerationSystem();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_HVAC_COMPRESSOR_OR_FURNACE:
            unsetIsHvacCompressorOrFurnace();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_INTERIOR_LIGHTING:
            unsetIsInteriorLighting();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_IRRIGATION_PUMP:
            unsetIsIrrigationPump();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD:
            unsetIsManagedCommercialIndustrialLoad();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_POOL_PUMP_SPA_JACUZZI:
            unsetIsPoolPumpSpaJacuzzi();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_SIMPLE_MISC_LOAD:
            unsetIsSimpleMiscLoad();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_SMART_APPLIANCE:
            unsetIsSmartAppliance();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_STRIP_AND_BASEBOARD_HEATER:
            unsetIsStripAndBaseboardHeater();
            return;
        case CimPackage.CONTROLLED_APPLIANCE__IS_WATER_HEATER:
            unsetIsWaterHeater();
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
        case CimPackage.CONTROLLED_APPLIANCE__IS_ELECTRIC_VEHICLE:
            return isSetIsElectricVehicle();
        case CimPackage.CONTROLLED_APPLIANCE__IS_EXTERIOR_LIGHTING:
            return isSetIsExteriorLighting();
        case CimPackage.CONTROLLED_APPLIANCE__IS_GENERATION_SYSTEM:
            return isSetIsGenerationSystem();
        case CimPackage.CONTROLLED_APPLIANCE__IS_HVAC_COMPRESSOR_OR_FURNACE:
            return isSetIsHvacCompressorOrFurnace();
        case CimPackage.CONTROLLED_APPLIANCE__IS_INTERIOR_LIGHTING:
            return isSetIsInteriorLighting();
        case CimPackage.CONTROLLED_APPLIANCE__IS_IRRIGATION_PUMP:
            return isSetIsIrrigationPump();
        case CimPackage.CONTROLLED_APPLIANCE__IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD:
            return isSetIsManagedCommercialIndustrialLoad();
        case CimPackage.CONTROLLED_APPLIANCE__IS_POOL_PUMP_SPA_JACUZZI:
            return isSetIsPoolPumpSpaJacuzzi();
        case CimPackage.CONTROLLED_APPLIANCE__IS_SIMPLE_MISC_LOAD:
            return isSetIsSimpleMiscLoad();
        case CimPackage.CONTROLLED_APPLIANCE__IS_SMART_APPLIANCE:
            return isSetIsSmartAppliance();
        case CimPackage.CONTROLLED_APPLIANCE__IS_STRIP_AND_BASEBOARD_HEATER:
            return isSetIsStripAndBaseboardHeater();
        case CimPackage.CONTROLLED_APPLIANCE__IS_WATER_HEATER:
            return isSetIsWaterHeater();
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

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (isElectricVehicle: " );
        if( isElectricVehicleESet )
            result.append( isElectricVehicle );
        else
            result.append( "<unset>" );
        result.append( ", isExteriorLighting: " );
        if( isExteriorLightingESet )
            result.append( isExteriorLighting );
        else
            result.append( "<unset>" );
        result.append( ", isGenerationSystem: " );
        if( isGenerationSystemESet )
            result.append( isGenerationSystem );
        else
            result.append( "<unset>" );
        result.append( ", isHvacCompressorOrFurnace: " );
        if( isHvacCompressorOrFurnaceESet )
            result.append( isHvacCompressorOrFurnace );
        else
            result.append( "<unset>" );
        result.append( ", isInteriorLighting: " );
        if( isInteriorLightingESet )
            result.append( isInteriorLighting );
        else
            result.append( "<unset>" );
        result.append( ", isIrrigationPump: " );
        if( isIrrigationPumpESet )
            result.append( isIrrigationPump );
        else
            result.append( "<unset>" );
        result.append( ", isManagedCommercialIndustrialLoad: " );
        if( isManagedCommercialIndustrialLoadESet )
            result.append( isManagedCommercialIndustrialLoad );
        else
            result.append( "<unset>" );
        result.append( ", isPoolPumpSpaJacuzzi: " );
        if( isPoolPumpSpaJacuzziESet )
            result.append( isPoolPumpSpaJacuzzi );
        else
            result.append( "<unset>" );
        result.append( ", isSimpleMiscLoad: " );
        if( isSimpleMiscLoadESet )
            result.append( isSimpleMiscLoad );
        else
            result.append( "<unset>" );
        result.append( ", isSmartAppliance: " );
        if( isSmartApplianceESet )
            result.append( isSmartAppliance );
        else
            result.append( "<unset>" );
        result.append( ", isStripAndBaseboardHeater: " );
        if( isStripAndBaseboardHeaterESet )
            result.append( isStripAndBaseboardHeater );
        else
            result.append( "<unset>" );
        result.append( ", isWaterHeater: " );
        if( isWaterHeaterESet )
            result.append( isWaterHeater );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ControlledApplianceImpl
