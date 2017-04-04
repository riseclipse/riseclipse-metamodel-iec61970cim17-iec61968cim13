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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FossilFuelItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FossilFuelItemProvider( AdapterFactory adapterFactory ) {
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

            addFossilFuelTypePropertyDescriptor( object );
            addFuelCostPropertyDescriptor( object );
            addFuelDispatchCostPropertyDescriptor( object );
            addFuelEffFactorPropertyDescriptor( object );
            addFuelHandlingCostPropertyDescriptor( object );
            addFuelHeatContentPropertyDescriptor( object );
            addFuelMixturePropertyDescriptor( object );
            addFuelSulfurPropertyDescriptor( object );
            addHighBreakpointPPropertyDescriptor( object );
            addLowBreakpointPPropertyDescriptor( object );
            addThermalGeneratingUnitPropertyDescriptor( object );
            addFuelAllocationSchedulesPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Fossil Fuel Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFossilFuelTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_fossilFuelType_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_fossilFuelType_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_FossilFuelType(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_fuelCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_fuelCost_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_FuelCost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Dispatch Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelDispatchCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_fuelDispatchCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_fuelDispatchCost_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_FuelDispatchCost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Eff Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelEffFactorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_fuelEffFactor_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_fuelEffFactor_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_FuelEffFactor(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Handling Cost feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelHandlingCostPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_fuelHandlingCost_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_fuelHandlingCost_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_FuelHandlingCost(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Heat Content feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelHeatContentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_fuelHeatContent_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_fuelHeatContent_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_FuelHeatContent(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Mixture feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelMixturePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_fuelMixture_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_fuelMixture_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_FuelMixture(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Sulfur feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelSulfurPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_fuelSulfur_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_fuelSulfur_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_FuelSulfur(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the High Breakpoint P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHighBreakpointPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_highBreakpointP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_highBreakpointP_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_HighBreakpointP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Low Breakpoint P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowBreakpointPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_lowBreakpointP_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_lowBreakpointP_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_LowBreakpointP(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Thermal Generating Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThermalGeneratingUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FossilFuel_ThermalGeneratingUnit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_ThermalGeneratingUnit_feature",
                                "_UI_FossilFuel_type" ),
                        CimPackage.eINSTANCE.getFossilFuel_ThermalGeneratingUnit(), true, false, true, null, null,
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
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FossilFuel_FuelAllocationSchedules_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FossilFuel_FuelAllocationSchedules_feature",
                        "_UI_FossilFuel_type" ),
                CimPackage.eINSTANCE.getFossilFuel_FuelAllocationSchedules(), true, false, true, null, null, null ) );
    }

    /**
     * This returns FossilFuel.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/FossilFuel" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( FossilFuel ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_FossilFuel_type" )
                : getString( "_UI_FossilFuel_type" ) + " " + label;
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

        switch( notification.getFeatureID( FossilFuel.class ) ) {
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
        case CimPackage.FOSSIL_FUEL__FUEL_COST:
        case CimPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
        case CimPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
        case CimPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
        case CimPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
        case CimPackage.FOSSIL_FUEL__FUEL_MIXTURE:
        case CimPackage.FOSSIL_FUEL__FUEL_SULFUR:
        case CimPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
        case CimPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
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
