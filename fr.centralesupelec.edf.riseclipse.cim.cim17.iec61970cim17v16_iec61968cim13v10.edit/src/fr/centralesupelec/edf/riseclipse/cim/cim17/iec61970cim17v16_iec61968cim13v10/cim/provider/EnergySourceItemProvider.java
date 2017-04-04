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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySource;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnergySourceItemProvider extends EnergyConnectionItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnergySourceItemProvider( AdapterFactory adapterFactory ) {
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

            addActivePowerPropertyDescriptor( object );
            addNominalVoltagePropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addR0PropertyDescriptor( object );
            addReactivePowerPropertyDescriptor( object );
            addRnPropertyDescriptor( object );
            addVoltageAnglePropertyDescriptor( object );
            addVoltageMagnitudePropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addX0PropertyDescriptor( object );
            addXnPropertyDescriptor( object );
            addEnergySourcePhasePropertyDescriptor( object );
            addEnergySourceActionPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Active Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_activePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_activePower_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_ActivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Nominal Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_nominalVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_nominalVoltage_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_NominalVoltage(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_r_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addR0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_r0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_r0_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_R0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Reactive Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReactivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_reactivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_reactivePower_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_ReactivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_rn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_rn_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_Rn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Angle feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageAnglePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_voltageAngle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_voltageAngle_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_VoltageAngle(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Voltage Magnitude feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVoltageMagnitudePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_voltageMagnitude_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_voltageMagnitude_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_VoltageMagnitude(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_x_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_x_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_X(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addX0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_x0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_x0_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_X0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_xn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_xn_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_Xn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Energy Source Phase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergySourcePhasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_EnergySourcePhase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_EnergySourcePhase_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_EnergySourcePhase(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Energy Source Action feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEnergySourceActionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_EnergySource_EnergySourceAction_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergySource_EnergySourceAction_feature",
                                "_UI_EnergySource_type" ),
                        CimPackage.eINSTANCE.getEnergySource_EnergySourceAction(), true, false, true, null, null,
                        null ) );
    }

    /**
     * This returns EnergySource.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/EnergySource" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( EnergySource ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_EnergySource_type" )
                : getString( "_UI_EnergySource_type" ) + " " + label;
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

        switch( notification.getFeatureID( EnergySource.class ) ) {
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
        case CimPackage.ENERGY_SOURCE__R:
        case CimPackage.ENERGY_SOURCE__R0:
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
        case CimPackage.ENERGY_SOURCE__RN:
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
        case CimPackage.ENERGY_SOURCE__X:
        case CimPackage.ENERGY_SOURCE__X0:
        case CimPackage.ENERGY_SOURCE__XN:
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
