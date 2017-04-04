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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RotatingMachineDynamicsItemProvider extends DynamicsFunctionBlockItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RotatingMachineDynamicsItemProvider( AdapterFactory adapterFactory ) {
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

            addDampingPropertyDescriptor( object );
            addInertiaPropertyDescriptor( object );
            addSaturationFactorPropertyDescriptor( object );
            addSaturationFactor120PropertyDescriptor( object );
            addStatorLeakageReactancePropertyDescriptor( object );
            addStatorResistancePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Damping feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDampingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RotatingMachineDynamics_damping_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RotatingMachineDynamics_damping_feature",
                        "_UI_RotatingMachineDynamics_type" ),
                CimPackage.eINSTANCE.getRotatingMachineDynamics_Damping(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Inertia feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addInertiaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RotatingMachineDynamics_inertia_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RotatingMachineDynamics_inertia_feature",
                        "_UI_RotatingMachineDynamics_type" ),
                CimPackage.eINSTANCE.getRotatingMachineDynamics_Inertia(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Saturation Factor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSaturationFactorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RotatingMachineDynamics_saturationFactor_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RotatingMachineDynamics_saturationFactor_feature",
                        "_UI_RotatingMachineDynamics_type" ),
                CimPackage.eINSTANCE.getRotatingMachineDynamics_SaturationFactor(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Saturation Factor120 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSaturationFactor120PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RotatingMachineDynamics_saturationFactor120_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_RotatingMachineDynamics_saturationFactor120_feature", "_UI_RotatingMachineDynamics_type" ),
                CimPackage.eINSTANCE.getRotatingMachineDynamics_SaturationFactor120(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Stator Leakage Reactance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatorLeakageReactancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_RotatingMachineDynamics_statorLeakageReactance_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_RotatingMachineDynamics_statorLeakageReactance_feature",
                                "_UI_RotatingMachineDynamics_type" ),
                        CimPackage.eINSTANCE.getRotatingMachineDynamics_StatorLeakageReactance(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Stator Resistance feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStatorResistancePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_RotatingMachineDynamics_statorResistance_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_RotatingMachineDynamics_statorResistance_feature",
                        "_UI_RotatingMachineDynamics_type" ),
                CimPackage.eINSTANCE.getRotatingMachineDynamics_StatorResistance(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns RotatingMachineDynamics.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/RotatingMachineDynamics" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( RotatingMachineDynamics ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_RotatingMachineDynamics_type" )
                : getString( "_UI_RotatingMachineDynamics_type" ) + " " + label;
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

        switch( notification.getFeatureID( RotatingMachineDynamics.class ) ) {
        case CimPackage.ROTATING_MACHINE_DYNAMICS__DAMPING:
        case CimPackage.ROTATING_MACHINE_DYNAMICS__INERTIA:
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR:
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR120:
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_LEAKAGE_REACTANCE:
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_RESISTANCE:
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
