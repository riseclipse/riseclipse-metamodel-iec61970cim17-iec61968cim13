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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FuelAllocationScheduleItemProvider extends CurveItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FuelAllocationScheduleItemProvider( AdapterFactory adapterFactory ) {
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

            addFuelAllocationEndDatePropertyDescriptor( object );
            addFuelAllocationStartDatePropertyDescriptor( object );
            addFuelTypePropertyDescriptor( object );
            addMaxFuelAllocationPropertyDescriptor( object );
            addMinFuelAllocationPropertyDescriptor( object );
            addThermalGeneratingUnitPropertyDescriptor( object );
            addFossilFuelPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Fuel Allocation End Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelAllocationEndDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FuelAllocationSchedule_fuelAllocationEndDate_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_FuelAllocationSchedule_fuelAllocationEndDate_feature", "_UI_FuelAllocationSchedule_type" ),
                CimPackage.eINSTANCE.getFuelAllocationSchedule_FuelAllocationEndDate(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Allocation Start Date feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelAllocationStartDatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_FuelAllocationSchedule_fuelAllocationStartDate_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_FuelAllocationSchedule_fuelAllocationStartDate_feature",
                                "_UI_FuelAllocationSchedule_type" ),
                        CimPackage.eINSTANCE.getFuelAllocationSchedule_FuelAllocationStartDate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fuel Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFuelTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FuelAllocationSchedule_fuelType_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FuelAllocationSchedule_fuelType_feature",
                        "_UI_FuelAllocationSchedule_type" ),
                CimPackage.eINSTANCE.getFuelAllocationSchedule_FuelType(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Fuel Allocation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxFuelAllocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FuelAllocationSchedule_maxFuelAllocation_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FuelAllocationSchedule_maxFuelAllocation_feature",
                        "_UI_FuelAllocationSchedule_type" ),
                CimPackage.eINSTANCE.getFuelAllocationSchedule_MaxFuelAllocation(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Fuel Allocation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinFuelAllocationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FuelAllocationSchedule_minFuelAllocation_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FuelAllocationSchedule_minFuelAllocation_feature",
                        "_UI_FuelAllocationSchedule_type" ),
                CimPackage.eINSTANCE.getFuelAllocationSchedule_MinFuelAllocation(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                getString( "_UI_FuelAllocationSchedule_ThermalGeneratingUnit_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_FuelAllocationSchedule_ThermalGeneratingUnit_feature", "_UI_FuelAllocationSchedule_type" ),
                CimPackage.eINSTANCE.getFuelAllocationSchedule_ThermalGeneratingUnit(), true, false, true, null, null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Fossil Fuel feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFossilFuelPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_FuelAllocationSchedule_FossilFuel_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_FuelAllocationSchedule_FossilFuel_feature",
                        "_UI_FuelAllocationSchedule_type" ),
                CimPackage.eINSTANCE.getFuelAllocationSchedule_FossilFuel(), true, false, true, null, null, null ) );
    }

    /**
     * This returns FuelAllocationSchedule.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/FuelAllocationSchedule" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( FuelAllocationSchedule ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_FuelAllocationSchedule_type" )
                : getString( "_UI_FuelAllocationSchedule_type" ) + " " + label;
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

        switch( notification.getFeatureID( FuelAllocationSchedule.class ) ) {
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_END_DATE:
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_ALLOCATION_START_DATE:
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__FUEL_TYPE:
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MAX_FUEL_ALLOCATION:
        case CimPackage.FUEL_ALLOCATION_SCHEDULE__MIN_FUEL_ALLOCATION:
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
