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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReservoirItemProvider extends PowerSystemResourceItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReservoirItemProvider( AdapterFactory adapterFactory ) {
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

            addActiveStorageCapacityPropertyDescriptor( object );
            addEnergyStorageRatingPropertyDescriptor( object );
            addFullSupplyLevelPropertyDescriptor( object );
            addGrossCapacityPropertyDescriptor( object );
            addNormalMinOperateLevelPropertyDescriptor( object );
            addRiverOutletWorksPropertyDescriptor( object );
            addSpillTravelDelayPropertyDescriptor( object );
            addSpillwayCapacityPropertyDescriptor( object );
            addSpillwayCrestLengthPropertyDescriptor( object );
            addSpillwayCrestLevelPropertyDescriptor( object );
            addSpillWayGateTypePropertyDescriptor( object );
            addSpillsFromReservoirPropertyDescriptor( object );
            addUpstreamFromHydroPowerPlantsPropertyDescriptor( object );
            addLevelVsVolumeCurvesPropertyDescriptor( object );
            addInflowForecastsPropertyDescriptor( object );
            addTargetLevelSchedulePropertyDescriptor( object );
            addHydroPowerPlantsPropertyDescriptor( object );
            addSpillsIntoReservoirsPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Active Storage Capacity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActiveStorageCapacityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_activeStorageCapacity_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_activeStorageCapacity_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_ActiveStorageCapacity(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Energy Storage Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergyStorageRatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_energyStorageRating_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_energyStorageRating_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_EnergyStorageRating(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Full Supply Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFullSupplyLevelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_fullSupplyLevel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_fullSupplyLevel_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_FullSupplyLevel(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gross Capacity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGrossCapacityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_grossCapacity_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_grossCapacity_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_GrossCapacity(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Normal Min Operate Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNormalMinOperateLevelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_normalMinOperateLevel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_normalMinOperateLevel_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_NormalMinOperateLevel(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the River Outlet Works feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRiverOutletWorksPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_riverOutletWorks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_riverOutletWorks_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_RiverOutletWorks(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Spill Travel Delay feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpillTravelDelayPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_spillTravelDelay_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_spillTravelDelay_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_SpillTravelDelay(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Spillway Capacity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpillwayCapacityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_spillwayCapacity_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_spillwayCapacity_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_SpillwayCapacity(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Spillway Crest Length feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpillwayCrestLengthPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_spillwayCrestLength_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_spillwayCrestLength_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_SpillwayCrestLength(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Spillway Crest Level feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpillwayCrestLevelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_spillwayCrestLevel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_spillwayCrestLevel_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_SpillwayCrestLevel(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Spill Way Gate Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpillWayGateTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_spillWayGateType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_spillWayGateType_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_SpillWayGateType(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Spills From Reservoir feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpillsFromReservoirPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_SpillsFromReservoir_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_SpillsFromReservoir_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_SpillsFromReservoir(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Upstream From Hydro Power Plants feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpstreamFromHydroPowerPlantsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_UpstreamFromHydroPowerPlants_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_Reservoir_UpstreamFromHydroPowerPlants_feature", "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_UpstreamFromHydroPowerPlants(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Level Vs Volume Curves feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLevelVsVolumeCurvesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_LevelVsVolumeCurves_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_LevelVsVolumeCurves_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_LevelVsVolumeCurves(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Inflow Forecasts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInflowForecastsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_InflowForecasts_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_InflowForecasts_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_InflowForecasts(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Target Level Schedule feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetLevelSchedulePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_TargetLevelSchedule_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_TargetLevelSchedule_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_TargetLevelSchedule(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Power Plants feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroPowerPlantsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_HydroPowerPlants_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_HydroPowerPlants_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_HydroPowerPlants(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Spills Into Reservoirs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpillsIntoReservoirsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_Reservoir_SpillsIntoReservoirs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_Reservoir_SpillsIntoReservoirs_feature",
                                "_UI_Reservoir_type" ),
                        CimPackage.eINSTANCE.getReservoir_SpillsIntoReservoirs(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This returns Reservoir.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/Reservoir" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( Reservoir ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_Reservoir_type" )
                : getString( "_UI_Reservoir_type" ) + " " + label;
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

        switch( notification.getFeatureID( Reservoir.class ) ) {
        case CimPackage.RESERVOIR__ACTIVE_STORAGE_CAPACITY:
        case CimPackage.RESERVOIR__ENERGY_STORAGE_RATING:
        case CimPackage.RESERVOIR__FULL_SUPPLY_LEVEL:
        case CimPackage.RESERVOIR__GROSS_CAPACITY:
        case CimPackage.RESERVOIR__NORMAL_MIN_OPERATE_LEVEL:
        case CimPackage.RESERVOIR__RIVER_OUTLET_WORKS:
        case CimPackage.RESERVOIR__SPILL_TRAVEL_DELAY:
        case CimPackage.RESERVOIR__SPILLWAY_CAPACITY:
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LENGTH:
        case CimPackage.RESERVOIR__SPILLWAY_CREST_LEVEL:
        case CimPackage.RESERVOIR__SPILL_WAY_GATE_TYPE:
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
