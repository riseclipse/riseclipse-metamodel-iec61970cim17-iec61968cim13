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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DispatchablePowerCapability} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DispatchablePowerCapabilityItemProvider extends CimObjectWithIDItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DispatchablePowerCapabilityItemProvider( AdapterFactory adapterFactory ) {
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

            addCurrentActivePowerPropertyDescriptor( object );
            addCurrentApparentPowerPropertyDescriptor( object );
            addCurrentReactivePowerPropertyDescriptor( object );
            addMaxActivePowerPropertyDescriptor( object );
            addMaxApparentPowerPropertyDescriptor( object );
            addMaxReactivePowerPropertyDescriptor( object );
            addMinActivePowerPropertyDescriptor( object );
            addMinApparentPowerPropertyDescriptor( object );
            addMinReactivePowerPropertyDescriptor( object );
            addEndDeviceGroupPropertyDescriptor( object );
            addEndDevicePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Current Active Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentActivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DispatchablePowerCapability_currentActivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DispatchablePowerCapability_currentActivePower_feature",
                                "_UI_DispatchablePowerCapability_type" ),
                        CimPackage.eINSTANCE.getDispatchablePowerCapability_CurrentActivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Current Apparent Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentApparentPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_DispatchablePowerCapability_currentApparentPower_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_DispatchablePowerCapability_currentApparentPower_feature",
                        "_UI_DispatchablePowerCapability_type" ),
                CimPackage.eINSTANCE.getDispatchablePowerCapability_CurrentApparentPower(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Current Reactive Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCurrentReactivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_DispatchablePowerCapability_currentReactivePower_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_DispatchablePowerCapability_currentReactivePower_feature",
                        "_UI_DispatchablePowerCapability_type" ),
                CimPackage.eINSTANCE.getDispatchablePowerCapability_CurrentReactivePower(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Active Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxActivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DispatchablePowerCapability_maxActivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DispatchablePowerCapability_maxActivePower_feature",
                                "_UI_DispatchablePowerCapability_type" ),
                        CimPackage.eINSTANCE.getDispatchablePowerCapability_MaxActivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Apparent Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxApparentPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DispatchablePowerCapability_maxApparentPower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DispatchablePowerCapability_maxApparentPower_feature",
                                "_UI_DispatchablePowerCapability_type" ),
                        CimPackage.eINSTANCE.getDispatchablePowerCapability_MaxApparentPower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Max Reactive Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxReactivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DispatchablePowerCapability_maxReactivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DispatchablePowerCapability_maxReactivePower_feature",
                                "_UI_DispatchablePowerCapability_type" ),
                        CimPackage.eINSTANCE.getDispatchablePowerCapability_MaxReactivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Active Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinActivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DispatchablePowerCapability_minActivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DispatchablePowerCapability_minActivePower_feature",
                                "_UI_DispatchablePowerCapability_type" ),
                        CimPackage.eINSTANCE.getDispatchablePowerCapability_MinActivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Apparent Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinApparentPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DispatchablePowerCapability_minApparentPower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DispatchablePowerCapability_minApparentPower_feature",
                                "_UI_DispatchablePowerCapability_type" ),
                        CimPackage.eINSTANCE.getDispatchablePowerCapability_MinApparentPower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Min Reactive Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinReactivePowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DispatchablePowerCapability_minReactivePower_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DispatchablePowerCapability_minReactivePower_feature",
                                "_UI_DispatchablePowerCapability_type" ),
                        CimPackage.eINSTANCE.getDispatchablePowerCapability_MinReactivePower(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDeviceGroupPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_DispatchablePowerCapability_EndDeviceGroup_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_DispatchablePowerCapability_EndDeviceGroup_feature",
                                "_UI_DispatchablePowerCapability_type" ),
                        CimPackage.eINSTANCE.getDispatchablePowerCapability_EndDeviceGroup(), true, false, true, null,
                        null, null ) );
    }

    /**
     * This adds a property descriptor for the End Device feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEndDevicePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_DispatchablePowerCapability_EndDevice_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_DispatchablePowerCapability_EndDevice_feature",
                        "_UI_DispatchablePowerCapability_type" ),
                CimPackage.eINSTANCE.getDispatchablePowerCapability_EndDevice(), true, false, true, null, null,
                null ) );
    }

    /**
     * This returns DispatchablePowerCapability.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/DispatchablePowerCapability" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( DispatchablePowerCapability ) object ).getID();
        return label == null || label.length() == 0 ? getString( "_UI_DispatchablePowerCapability_type" )
                : getString( "_UI_DispatchablePowerCapability_type" ) + " " + label;
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

        switch( notification.getFeatureID( DispatchablePowerCapability.class ) ) {
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_ACTIVE_POWER:
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_APPARENT_POWER:
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__CURRENT_REACTIVE_POWER:
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_ACTIVE_POWER:
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_APPARENT_POWER:
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MAX_REACTIVE_POWER:
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_ACTIVE_POWER:
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_APPARENT_POWER:
        case CimPackage.DISPATCHABLE_POWER_CAPABILITY__MIN_REACTIVE_POWER:
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
