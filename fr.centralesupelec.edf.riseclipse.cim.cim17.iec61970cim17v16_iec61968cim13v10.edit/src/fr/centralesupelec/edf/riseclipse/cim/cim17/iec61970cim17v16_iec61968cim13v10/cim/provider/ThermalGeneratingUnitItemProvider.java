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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThermalGeneratingUnitItemProvider extends GeneratingUnitItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ThermalGeneratingUnitItemProvider( AdapterFactory adapterFactory ) {
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

            addOMCostPropertyDescriptor( object );
            addStartupModelPropertyDescriptor( object );
            addIncrementalHeatRateCurvePropertyDescriptor( object );
            addEmissionCurvesPropertyDescriptor( object );
            addFuelAllocationSchedulesPropertyDescriptor( object );
            addCombinedCyclePlantPropertyDescriptor( object );
            addShutdownCurvePropertyDescriptor( object );
            addHeatRateCurvePropertyDescriptor( object );
            addFossilFuelsPropertyDescriptor( object );
            addHeatInputCurvePropertyDescriptor( object );
            addCAESPlantPropertyDescriptor( object );
            addEmmissionAccountsPropertyDescriptor( object );
            addCogenerationPlantPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the OM Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOMCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_oMCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ThermalGeneratingUnit_oMCost_feature",
                                "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_OMCost(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Startup Model feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartupModelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_StartupModel_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ThermalGeneratingUnit_StartupModel_feature", "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_StartupModel(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Incremental Heat Rate Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncrementalHeatRateCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_IncrementalHeatRateCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ThermalGeneratingUnit_IncrementalHeatRateCurve_feature",
                                "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_IncrementalHeatRateCurve(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Emission Curves feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEmissionCurvesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_EmissionCurves_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ThermalGeneratingUnit_EmissionCurves_feature", "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_EmissionCurves(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Allocation Schedules feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelAllocationSchedulesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ThermalGeneratingUnit_FuelAllocationSchedules_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ThermalGeneratingUnit_FuelAllocationSchedules_feature", "_UI_ThermalGeneratingUnit_type" ),
                CimPackage.eINSTANCE.getThermalGeneratingUnit_FuelAllocationSchedules(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Combined Cycle Plant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCombinedCyclePlantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ThermalGeneratingUnit_CombinedCyclePlant_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ThermalGeneratingUnit_CombinedCyclePlant_feature",
                        "_UI_ThermalGeneratingUnit_type" ),
                CimPackage.eINSTANCE.getThermalGeneratingUnit_CombinedCyclePlant(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Shutdown Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addShutdownCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_ShutdownCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ThermalGeneratingUnit_ShutdownCurve_feature", "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_ShutdownCurve(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Heat Rate Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeatRateCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_HeatRateCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ThermalGeneratingUnit_HeatRateCurve_feature", "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_HeatRateCurve(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Fossil Fuels feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFossilFuelsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_FossilFuels_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ThermalGeneratingUnit_FossilFuels_feature", "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_FossilFuels(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Heat Input Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHeatInputCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_HeatInputCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ThermalGeneratingUnit_HeatInputCurve_feature", "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_HeatInputCurve(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the CAES Plant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCAESPlantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ThermalGeneratingUnit_CAESPlant_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ThermalGeneratingUnit_CAESPlant_feature",
                                "_UI_ThermalGeneratingUnit_type" ),
                        CimPackage.eINSTANCE.getThermalGeneratingUnit_CAESPlant(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Emmission Accounts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEmmissionAccountsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ThermalGeneratingUnit_EmmissionAccounts_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ThermalGeneratingUnit_EmmissionAccounts_feature",
                        "_UI_ThermalGeneratingUnit_type" ),
                CimPackage.eINSTANCE.getThermalGeneratingUnit_EmmissionAccounts(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Cogeneration Plant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCogenerationPlantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_ThermalGeneratingUnit_CogenerationPlant_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ThermalGeneratingUnit_CogenerationPlant_feature",
                        "_UI_ThermalGeneratingUnit_type" ),
                CimPackage.eINSTANCE.getThermalGeneratingUnit_CogenerationPlant(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This returns ThermalGeneratingUnit.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ThermalGeneratingUnit" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ThermalGeneratingUnit ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ThermalGeneratingUnit_type" )
                : getString( "_UI_ThermalGeneratingUnit_type" ) + " " + label;
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

        switch( notification.getFeatureID( ThermalGeneratingUnit.class ) ) {
        case CimPackage.THERMAL_GENERATING_UNIT__OM_COST:
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
