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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HydroPumpItemProvider extends EquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HydroPumpItemProvider( AdapterFactory adapterFactory ) {
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

            addPumpDischAtMaxHeadPropertyDescriptor( object );
            addPumpDischAtMinHeadPropertyDescriptor( object );
            addPumpPowerAtMaxHeadPropertyDescriptor( object );
            addPumpPowerAtMinHeadPropertyDescriptor( object );
            addRotatingMachinePropertyDescriptor( object );
            addHydroPowerPlantPropertyDescriptor( object );
            addHydroPumpOpSchedulePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Pump Disch At Max Head feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPumpDischAtMaxHeadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPump_pumpDischAtMaxHead_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPump_pumpDischAtMaxHead_feature",
                                "_UI_HydroPump_type" ),
                        CimPackage.eINSTANCE.getHydroPump_PumpDischAtMaxHead(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pump Disch At Min Head feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPumpDischAtMinHeadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPump_pumpDischAtMinHead_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPump_pumpDischAtMinHead_feature",
                                "_UI_HydroPump_type" ),
                        CimPackage.eINSTANCE.getHydroPump_PumpDischAtMinHead(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pump Power At Max Head feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPumpPowerAtMaxHeadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPump_pumpPowerAtMaxHead_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPump_pumpPowerAtMaxHead_feature",
                                "_UI_HydroPump_type" ),
                        CimPackage.eINSTANCE.getHydroPump_PumpPowerAtMaxHead(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pump Power At Min Head feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPumpPowerAtMinHeadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPump_pumpPowerAtMinHead_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPump_pumpPowerAtMinHead_feature",
                                "_UI_HydroPump_type" ),
                        CimPackage.eINSTANCE.getHydroPump_PumpPowerAtMinHead(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rotating Machine feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRotatingMachinePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPump_RotatingMachine_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPump_RotatingMachine_feature",
                                "_UI_HydroPump_type" ),
                        CimPackage.eINSTANCE.getHydroPump_RotatingMachine(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Power Plant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroPowerPlantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPump_HydroPowerPlant_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPump_HydroPowerPlant_feature",
                                "_UI_HydroPump_type" ),
                        CimPackage.eINSTANCE.getHydroPump_HydroPowerPlant(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hydro Pump Op Schedule feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHydroPumpOpSchedulePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_HydroPump_HydroPumpOpSchedule_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_HydroPump_HydroPumpOpSchedule_feature",
                                "_UI_HydroPump_type" ),
                        CimPackage.eINSTANCE.getHydroPump_HydroPumpOpSchedule(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns HydroPump.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/HydroPump" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( HydroPump ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_HydroPump_type" )
                : getString( "_UI_HydroPump_type" ) + " " + label;
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

        switch( notification.getFeatureID( HydroPump.class ) ) {
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MAX_HEAD:
        case CimPackage.HYDRO_PUMP__PUMP_DISCH_AT_MIN_HEAD:
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MAX_HEAD:
        case CimPackage.HYDRO_PUMP__PUMP_POWER_AT_MIN_HEAD:
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
