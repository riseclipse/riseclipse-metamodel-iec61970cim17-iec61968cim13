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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StartupModelItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartupModelItemProvider( AdapterFactory adapterFactory ) {
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

            addFixedMaintCostPropertyDescriptor( object );
            addHotStandbyHeatPropertyDescriptor( object );
            addIncrementalMaintCostPropertyDescriptor( object );
            addMinimumDownTimePropertyDescriptor( object );
            addMinimumRunTimePropertyDescriptor( object );
            addRiskFactorCostPropertyDescriptor( object );
            addStartupCostPropertyDescriptor( object );
            addStartupDatePropertyDescriptor( object );
            addStartupPriorityPropertyDescriptor( object );
            addStbyAuxPPropertyDescriptor( object );
            addStartRampCurvePropertyDescriptor( object );
            addStartIgnFuelCurvePropertyDescriptor( object );
            addStartMainFuelCurvePropertyDescriptor( object );
            addThermalGeneratingUnitPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Fixed Maint Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFixedMaintCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_fixedMaintCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_fixedMaintCost_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_FixedMaintCost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hot Standby Heat feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHotStandbyHeatPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_hotStandbyHeat_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_hotStandbyHeat_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_HotStandbyHeat(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Incremental Maint Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIncrementalMaintCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_StartupModel_incrementalMaintCost_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_incrementalMaintCost_feature",
                        "_UI_StartupModel_type" ),
                CimPackage.eINSTANCE.getStartupModel_IncrementalMaintCost(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Minimum Down Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinimumDownTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_minimumDownTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_minimumDownTime_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_MinimumDownTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Minimum Run Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinimumRunTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_minimumRunTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_minimumRunTime_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_MinimumRunTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Risk Factor Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRiskFactorCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_riskFactorCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_riskFactorCost_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_RiskFactorCost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Startup Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartupCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_startupCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_startupCost_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_StartupCost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Startup Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartupDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_startupDate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_startupDate_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_StartupDate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Startup Priority feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartupPriorityPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_startupPriority_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_startupPriority_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_StartupPriority(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Stby Aux P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStbyAuxPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_stbyAuxP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_stbyAuxP_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_StbyAuxP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Start Ramp Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartRampCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_StartRampCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_StartRampCurve_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_StartRampCurve(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Start Ign Fuel Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartIgnFuelCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_StartIgnFuelCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_StartIgnFuelCurve_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_StartIgnFuelCurve(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Start Main Fuel Curve feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStartMainFuelCurvePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_StartupModel_StartMainFuelCurve_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_StartMainFuelCurve_feature",
                                "_UI_StartupModel_type" ),
                        CimPackage.eINSTANCE.getStartupModel_StartMainFuelCurve(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Thermal Generating Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThermalGeneratingUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_StartupModel_ThermalGeneratingUnit_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_StartupModel_ThermalGeneratingUnit_feature",
                        "_UI_StartupModel_type" ),
                CimPackage.eINSTANCE.getStartupModel_ThermalGeneratingUnit(), true, false, true, null, null, null ) );
    }

    /**
     * This returns StartupModel.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/StartupModel" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( StartupModel ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_StartupModel_type" )
                : getString( "_UI_StartupModel_type" ) + " " + label;
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

        switch( notification.getFeatureID( StartupModel.class ) ) {
        case CimPackage.STARTUP_MODEL__FIXED_MAINT_COST:
        case CimPackage.STARTUP_MODEL__HOT_STANDBY_HEAT:
        case CimPackage.STARTUP_MODEL__INCREMENTAL_MAINT_COST:
        case CimPackage.STARTUP_MODEL__MINIMUM_DOWN_TIME:
        case CimPackage.STARTUP_MODEL__MINIMUM_RUN_TIME:
        case CimPackage.STARTUP_MODEL__RISK_FACTOR_COST:
        case CimPackage.STARTUP_MODEL__STARTUP_COST:
        case CimPackage.STARTUP_MODEL__STARTUP_DATE:
        case CimPackage.STARTUP_MODEL__STARTUP_PRIORITY:
        case CimPackage.STARTUP_MODEL__STBY_AUX_P:
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
