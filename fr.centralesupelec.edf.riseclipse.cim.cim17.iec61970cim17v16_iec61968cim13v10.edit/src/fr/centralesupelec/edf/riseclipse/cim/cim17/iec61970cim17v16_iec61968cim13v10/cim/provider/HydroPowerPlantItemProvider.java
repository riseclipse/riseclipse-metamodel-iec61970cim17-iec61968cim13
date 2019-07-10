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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPowerPlant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HydroPowerPlantItemProvider extends PowerSystemResourceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroPowerPlantItemProvider( AdapterFactory adapterFactory ) {
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

            addDischargeTravelDelayPropertyDescriptor( object );
            addGenRatedPPropertyDescriptor( object );
            addHydroPlantStorageTypePropertyDescriptor( object );
            addPenstockTypePropertyDescriptor( object );
            addPlantDischargeCapacityPropertyDescriptor( object );
            addPlantRatedHeadPropertyDescriptor( object );
            addPumpRatedPPropertyDescriptor( object );
            addSurgeTankCodePropertyDescriptor( object );
            addSurgeTankCrestLevelPropertyDescriptor( object );
            addHydroGeneratingUnitsPropertyDescriptor( object );
            addReservoirPropertyDescriptor( object );
            addGenSourcePumpDischargeReservoirPropertyDescriptor( object );
            addHydroPumpsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Discharge Travel Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDischargeTravelDelayPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_HydroPowerPlant_dischargeTravelDelay_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_dischargeTravelDelay_feature",
                        "_UI_HydroPowerPlant_type" ),
                CimPackage.eINSTANCE.getHydroPowerPlant_DischargeTravelDelay(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gen Rated P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenRatedPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPowerPlant_genRatedP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_genRatedP_feature",
                                "_UI_HydroPowerPlant_type" ),
                        CimPackage.eINSTANCE.getHydroPowerPlant_GenRatedP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Plant Storage Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroPlantStorageTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_HydroPowerPlant_hydroPlantStorageType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_hydroPlantStorageType_feature",
                        "_UI_HydroPowerPlant_type" ),
                CimPackage.eINSTANCE.getHydroPowerPlant_HydroPlantStorageType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Penstock Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPenstockTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPowerPlant_penstockType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_penstockType_feature",
                                "_UI_HydroPowerPlant_type" ),
                        CimPackage.eINSTANCE.getHydroPowerPlant_PenstockType(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plant Discharge Capacity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlantDischargeCapacityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_HydroPowerPlant_plantDischargeCapacity_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_plantDischargeCapacity_feature",
                        "_UI_HydroPowerPlant_type" ),
                CimPackage.eINSTANCE.getHydroPowerPlant_PlantDischargeCapacity(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Plant Rated Head feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPlantRatedHeadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPowerPlant_plantRatedHead_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_plantRatedHead_feature",
                                "_UI_HydroPowerPlant_type" ),
                        CimPackage.eINSTANCE.getHydroPowerPlant_PlantRatedHead(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pump Rated P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPumpRatedPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPowerPlant_pumpRatedP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_pumpRatedP_feature",
                                "_UI_HydroPowerPlant_type" ),
                        CimPackage.eINSTANCE.getHydroPowerPlant_PumpRatedP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Surge Tank Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSurgeTankCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPowerPlant_surgeTankCode_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_surgeTankCode_feature",
                                "_UI_HydroPowerPlant_type" ),
                        CimPackage.eINSTANCE.getHydroPowerPlant_SurgeTankCode(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Surge Tank Crest Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSurgeTankCrestLevelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_HydroPowerPlant_surgeTankCrestLevel_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_surgeTankCrestLevel_feature",
                        "_UI_HydroPowerPlant_type" ),
                CimPackage.eINSTANCE.getHydroPowerPlant_SurgeTankCrestLevel(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Generating Units feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroGeneratingUnitsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_HydroPowerPlant_HydroGeneratingUnits_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_HydroGeneratingUnits_feature",
                        "_UI_HydroPowerPlant_type" ),
                CimPackage.eINSTANCE.getHydroPowerPlant_HydroGeneratingUnits(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reservoir feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReservoirPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPowerPlant_Reservoir_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_Reservoir_feature",
                                "_UI_HydroPowerPlant_type" ),
                        CimPackage.eINSTANCE.getHydroPowerPlant_Reservoir(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gen Source Pump Discharge Reservoir feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGenSourcePumpDischargeReservoirPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_HydroPowerPlant_GenSourcePumpDischargeReservoir_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_HydroPowerPlant_GenSourcePumpDischargeReservoir_feature", "_UI_HydroPowerPlant_type" ),
                CimPackage.eINSTANCE.getHydroPowerPlant_GenSourcePumpDischargeReservoir(), true, false, true, null,
                null, null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Pumps feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroPumpsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPowerPlant_HydroPumps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPowerPlant_HydroPumps_feature",
                                "_UI_HydroPowerPlant_type" ),
                        CimPackage.eINSTANCE.getHydroPowerPlant_HydroPumps(), true, false, true, null, null, null ) );
    }

    /**
     * This returns HydroPowerPlant.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/HydroPowerPlant" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( HydroPowerPlant ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_HydroPowerPlant_type" )
                : getString( "_UI_HydroPowerPlant_type" ) + " " + label;
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

        switch( notification.getFeatureID( HydroPowerPlant.class ) ) {
        case CimPackage.HYDRO_POWER_PLANT__DISCHARGE_TRAVEL_DELAY:
        case CimPackage.HYDRO_POWER_PLANT__GEN_RATED_P:
        case CimPackage.HYDRO_POWER_PLANT__HYDRO_PLANT_STORAGE_TYPE:
        case CimPackage.HYDRO_POWER_PLANT__PENSTOCK_TYPE:
        case CimPackage.HYDRO_POWER_PLANT__PLANT_DISCHARGE_CAPACITY:
        case CimPackage.HYDRO_POWER_PLANT__PLANT_RATED_HEAD:
        case CimPackage.HYDRO_POWER_PLANT__PUMP_RATED_P:
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CODE:
        case CimPackage.HYDRO_POWER_PLANT__SURGE_TANK_CREST_LEVEL:
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

}
