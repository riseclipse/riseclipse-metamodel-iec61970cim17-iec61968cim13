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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlledAppliance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlledApplianceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlledApplianceItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addIsElectricVehiclePropertyDescriptor( object );
            addIsExteriorLightingPropertyDescriptor( object );
            addIsGenerationSystemPropertyDescriptor( object );
            addIsHvacCompressorOrFurnacePropertyDescriptor( object );
            addIsInteriorLightingPropertyDescriptor( object );
            addIsIrrigationPumpPropertyDescriptor( object );
            addIsManagedCommercialIndustrialLoadPropertyDescriptor( object );
            addIsPoolPumpSpaJacuzziPropertyDescriptor( object );
            addIsSimpleMiscLoadPropertyDescriptor( object );
            addIsSmartAppliancePropertyDescriptor( object );
            addIsStripAndBaseboardHeaterPropertyDescriptor( object );
            addIsWaterHeaterPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Is Electric Vehicle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsElectricVehiclePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ControlledAppliance_isElectricVehicle_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlledAppliance_isElectricVehicle_feature", "_UI_ControlledAppliance_type" ),
                        CimPackage.eINSTANCE.getControlledAppliance_IsElectricVehicle(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Exterior Lighting feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsExteriorLightingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ControlledAppliance_isExteriorLighting_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlledAppliance_isExteriorLighting_feature", "_UI_ControlledAppliance_type" ),
                        CimPackage.eINSTANCE.getControlledAppliance_IsExteriorLighting(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Generation System feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsGenerationSystemPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ControlledAppliance_isGenerationSystem_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlledAppliance_isGenerationSystem_feature", "_UI_ControlledAppliance_type" ),
                        CimPackage.eINSTANCE.getControlledAppliance_IsGenerationSystem(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Hvac Compressor Or Furnace feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsHvacCompressorOrFurnacePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ControlledAppliance_isHvacCompressorOrFurnace_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ControlledAppliance_isHvacCompressorOrFurnace_feature", "_UI_ControlledAppliance_type" ),
                CimPackage.eINSTANCE.getControlledAppliance_IsHvacCompressorOrFurnace(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Interior Lighting feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsInteriorLightingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ControlledAppliance_isInteriorLighting_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlledAppliance_isInteriorLighting_feature", "_UI_ControlledAppliance_type" ),
                        CimPackage.eINSTANCE.getControlledAppliance_IsInteriorLighting(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Irrigation Pump feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsIrrigationPumpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ControlledAppliance_isIrrigationPump_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlledAppliance_isIrrigationPump_feature", "_UI_ControlledAppliance_type" ),
                        CimPackage.eINSTANCE.getControlledAppliance_IsIrrigationPump(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Managed Commercial Industrial Load feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsManagedCommercialIndustrialLoadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ControlledAppliance_isManagedCommercialIndustrialLoad_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ControlledAppliance_isManagedCommercialIndustrialLoad_feature",
                        "_UI_ControlledAppliance_type" ),
                CimPackage.eINSTANCE.getControlledAppliance_IsManagedCommercialIndustrialLoad(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Pool Pump Spa Jacuzzi feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsPoolPumpSpaJacuzziPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ControlledAppliance_isPoolPumpSpaJacuzzi_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ControlledAppliance_isPoolPumpSpaJacuzzi_feature",
                        "_UI_ControlledAppliance_type" ),
                CimPackage.eINSTANCE.getControlledAppliance_IsPoolPumpSpaJacuzzi(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Simple Misc Load feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSimpleMiscLoadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ControlledAppliance_isSimpleMiscLoad_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlledAppliance_isSimpleMiscLoad_feature", "_UI_ControlledAppliance_type" ),
                        CimPackage.eINSTANCE.getControlledAppliance_IsSimpleMiscLoad(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Smart Appliance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsSmartAppliancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ControlledAppliance_isSmartAppliance_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ControlledAppliance_isSmartAppliance_feature", "_UI_ControlledAppliance_type" ),
                        CimPackage.eINSTANCE.getControlledAppliance_IsSmartAppliance(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Strip And Baseboard Heater feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsStripAndBaseboardHeaterPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ControlledAppliance_isStripAndBaseboardHeater_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ControlledAppliance_isStripAndBaseboardHeater_feature", "_UI_ControlledAppliance_type" ),
                CimPackage.eINSTANCE.getControlledAppliance_IsStripAndBaseboardHeater(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Water Heater feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsWaterHeaterPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ControlledAppliance_isWaterHeater_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ControlledAppliance_isWaterHeater_feature",
                        "_UI_ControlledAppliance_type" ),
                CimPackage.eINSTANCE.getControlledAppliance_IsWaterHeater(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ControlledAppliance.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ControlledAppliance" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        Boolean labelValue = ( ( ControlledAppliance ) object ).getIsElectricVehicle();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ? getString( "_UI_ControlledAppliance_type" )
                : getString( "_UI_ControlledAppliance_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( ControlledAppliance.class ) ) {
        case CimPackage.CONTROLLED_APPLIANCE__IS_ELECTRIC_VEHICLE:
        case CimPackage.CONTROLLED_APPLIANCE__IS_EXTERIOR_LIGHTING:
        case CimPackage.CONTROLLED_APPLIANCE__IS_GENERATION_SYSTEM:
        case CimPackage.CONTROLLED_APPLIANCE__IS_HVAC_COMPRESSOR_OR_FURNACE:
        case CimPackage.CONTROLLED_APPLIANCE__IS_INTERIOR_LIGHTING:
        case CimPackage.CONTROLLED_APPLIANCE__IS_IRRIGATION_PUMP:
        case CimPackage.CONTROLLED_APPLIANCE__IS_MANAGED_COMMERCIAL_INDUSTRIAL_LOAD:
        case CimPackage.CONTROLLED_APPLIANCE__IS_POOL_PUMP_SPA_JACUZZI:
        case CimPackage.CONTROLLED_APPLIANCE__IS_SIMPLE_MISC_LOAD:
        case CimPackage.CONTROLLED_APPLIANCE__IS_SMART_APPLIANCE:
        case CimPackage.CONTROLLED_APPLIANCE__IS_STRIP_AND_BASEBOARD_HEATER:
        case CimPackage.CONTROLLED_APPLIANCE__IS_WATER_HEATER:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Iec61970cim17v16_iec61968cim13v10EditPlugin.INSTANCE;
    }

}
