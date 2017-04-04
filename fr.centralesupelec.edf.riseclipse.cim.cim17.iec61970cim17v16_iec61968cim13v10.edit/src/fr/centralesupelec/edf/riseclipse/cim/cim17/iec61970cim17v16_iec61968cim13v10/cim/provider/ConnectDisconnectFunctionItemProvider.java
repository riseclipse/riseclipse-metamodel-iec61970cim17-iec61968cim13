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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectDisconnectFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectDisconnectFunctionItemProvider extends EndDeviceFunctionItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectDisconnectFunctionItemProvider( AdapterFactory adapterFactory ) {
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

            addEventCountPropertyDescriptor( object );
            addIsConnectedPropertyDescriptor( object );
            addIsDelayedDisconPropertyDescriptor( object );
            addIsLocalAutoDisconOpPropertyDescriptor( object );
            addIsLocalAutoReconOpPropertyDescriptor( object );
            addIsRemoteAutoDisconOpPropertyDescriptor( object );
            addIsRemoteAutoReconOpPropertyDescriptor( object );
            addSwitchesPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Event Count feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEventCountPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConnectDisconnectFunction_eventCount_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConnectDisconnectFunction_eventCount_feature",
                        "_UI_ConnectDisconnectFunction_type" ),
                CimPackage.eINSTANCE.getConnectDisconnectFunction_EventCount(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Connected feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsConnectedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConnectDisconnectFunction_isConnected_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConnectDisconnectFunction_isConnected_feature",
                        "_UI_ConnectDisconnectFunction_type" ),
                CimPackage.eINSTANCE.getConnectDisconnectFunction_IsConnected(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Delayed Discon feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsDelayedDisconPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConnectDisconnectFunction_isDelayedDiscon_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_ConnectDisconnectFunction_isDelayedDiscon_feature", "_UI_ConnectDisconnectFunction_type" ),
                CimPackage.eINSTANCE.getConnectDisconnectFunction_IsDelayedDiscon(), true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Local Auto Discon Op feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsLocalAutoDisconOpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ConnectDisconnectFunction_isLocalAutoDisconOp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConnectDisconnectFunction_isLocalAutoDisconOp_feature",
                                "_UI_ConnectDisconnectFunction_type" ),
                        CimPackage.eINSTANCE.getConnectDisconnectFunction_IsLocalAutoDisconOp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Local Auto Recon Op feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsLocalAutoReconOpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ConnectDisconnectFunction_isLocalAutoReconOp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConnectDisconnectFunction_isLocalAutoReconOp_feature",
                                "_UI_ConnectDisconnectFunction_type" ),
                        CimPackage.eINSTANCE.getConnectDisconnectFunction_IsLocalAutoReconOp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Remote Auto Discon Op feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsRemoteAutoDisconOpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ConnectDisconnectFunction_isRemoteAutoDisconOp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConnectDisconnectFunction_isRemoteAutoDisconOp_feature",
                                "_UI_ConnectDisconnectFunction_type" ),
                        CimPackage.eINSTANCE.getConnectDisconnectFunction_IsRemoteAutoDisconOp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Is Remote Auto Recon Op feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsRemoteAutoReconOpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ConnectDisconnectFunction_isRemoteAutoReconOp_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_ConnectDisconnectFunction_isRemoteAutoReconOp_feature",
                                "_UI_ConnectDisconnectFunction_type" ),
                        CimPackage.eINSTANCE.getConnectDisconnectFunction_IsRemoteAutoReconOp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switches feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchesPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_ConnectDisconnectFunction_Switches_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_ConnectDisconnectFunction_Switches_feature",
                        "_UI_ConnectDisconnectFunction_type" ),
                CimPackage.eINSTANCE.getConnectDisconnectFunction_Switches(), true, false, true, null, null, null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( CimPackage.eINSTANCE.getConnectDisconnectFunction_RcdInfo() );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns ConnectDisconnectFunction.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ConnectDisconnectFunction" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ConnectDisconnectFunction ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ConnectDisconnectFunction_type" )
                : getString( "_UI_ConnectDisconnectFunction_type" ) + " " + label;
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

        switch( notification.getFeatureID( ConnectDisconnectFunction.class ) ) {
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__EVENT_COUNT:
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_CONNECTED:
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_DELAYED_DISCON:
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_DISCON_OP:
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_LOCAL_AUTO_RECON_OP:
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_DISCON_OP:
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__IS_REMOTE_AUTO_RECON_OP:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.CONNECT_DISCONNECT_FUNCTION__RCD_INFO:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
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

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getConnectDisconnectFunction_RcdInfo(),
                CimFactory.eINSTANCE.createRemoteConnectDisconnectInfo() ) );
    }

}
