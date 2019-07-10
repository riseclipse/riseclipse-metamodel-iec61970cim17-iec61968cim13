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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HydroTurbineItemProvider extends PrimeMoverItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroTurbineItemProvider( AdapterFactory adapterFactory ) {
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

            addGateRateLimitPropertyDescriptor( object );
            addGateUpperLimitPropertyDescriptor( object );
            addMaxHeadMaxPPropertyDescriptor( object );
            addMinHeadMaxPPropertyDescriptor( object );
            addSpeedRatingPropertyDescriptor( object );
            addSpeedRegulationPropertyDescriptor( object );
            addTransientDroopTimePropertyDescriptor( object );
            addTransientRegulationPropertyDescriptor( object );
            addTurbineRatingPropertyDescriptor( object );
            addTurbineTypePropertyDescriptor( object );
            addWaterStartingTimePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Gate Rate Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGateRateLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_gateRateLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_gateRateLimit_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_GateRateLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Gate Upper Limit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGateUpperLimitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_gateUpperLimit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_gateUpperLimit_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_GateUpperLimit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Max Head Max P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxHeadMaxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_maxHeadMaxP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_maxHeadMaxP_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_MaxHeadMaxP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Min Head Max P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinHeadMaxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_minHeadMaxP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_minHeadMaxP_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_MinHeadMaxP(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Speed Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpeedRatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_speedRating_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_speedRating_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_SpeedRating(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Speed Regulation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSpeedRegulationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_speedRegulation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_speedRegulation_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_SpeedRegulation(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Transient Droop Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransientDroopTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_transientDroopTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_transientDroopTime_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_TransientDroopTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Transient Regulation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTransientRegulationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_transientRegulation_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_transientRegulation_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_TransientRegulation(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Turbine Rating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTurbineRatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_turbineRating_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_turbineRating_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_TurbineRating(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Turbine Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTurbineTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_turbineType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_turbineType_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_TurbineType(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Water Starting Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWaterStartingTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_HydroTurbine_waterStartingTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroTurbine_waterStartingTime_feature",
                                "_UI_HydroTurbine_type" ),
                        CimPackage.eINSTANCE.getHydroTurbine_WaterStartingTime(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns HydroTurbine.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/HydroTurbine" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( HydroTurbine ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_HydroTurbine_type" )
                : getString( "_UI_HydroTurbine_type" ) + " " + label;
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

        switch( notification.getFeatureID( HydroTurbine.class ) ) {
        case CimPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
        case CimPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
        case CimPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
        case CimPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
        case CimPackage.HYDRO_TURBINE__SPEED_RATING:
        case CimPackage.HYDRO_TURBINE__SPEED_REGULATION:
        case CimPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
        case CimPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
        case CimPackage.HYDRO_TURBINE__TURBINE_RATING:
        case CimPackage.HYDRO_TURBINE__TURBINE_TYPE:
        case CimPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
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
