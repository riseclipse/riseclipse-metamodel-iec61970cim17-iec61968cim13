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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ISOUpperLayerItemProvider extends TCPAccessPointItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ISOUpperLayerItemProvider( AdapterFactory adapterFactory ) {
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

            addAeInvokePropertyDescriptor( object );
            addAeQualPropertyDescriptor( object );
            addApInvokePropertyDescriptor( object );
            addApTitlePropertyDescriptor( object );
            addOsiPselPropertyDescriptor( object );
            addOsiSselPropertyDescriptor( object );
            addOsiTselPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ae Invoke feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAeInvokePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ISOUpperLayer_aeInvoke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ISOUpperLayer_aeInvoke_feature",
                                "_UI_ISOUpperLayer_type" ),
                        CimPackage.eINSTANCE.getISOUpperLayer_AeInvoke(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ae Qual feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAeQualPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ISOUpperLayer_aeQual_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ISOUpperLayer_aeQual_feature",
                                "_UI_ISOUpperLayer_type" ),
                        CimPackage.eINSTANCE.getISOUpperLayer_AeQual(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ap Invoke feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addApInvokePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ISOUpperLayer_apInvoke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ISOUpperLayer_apInvoke_feature",
                                "_UI_ISOUpperLayer_type" ),
                        CimPackage.eINSTANCE.getISOUpperLayer_ApInvoke(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ap Title feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addApTitlePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ISOUpperLayer_apTitle_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ISOUpperLayer_apTitle_feature",
                                "_UI_ISOUpperLayer_type" ),
                        CimPackage.eINSTANCE.getISOUpperLayer_ApTitle(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Osi Psel feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOsiPselPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ISOUpperLayer_osiPsel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ISOUpperLayer_osiPsel_feature",
                                "_UI_ISOUpperLayer_type" ),
                        CimPackage.eINSTANCE.getISOUpperLayer_OsiPsel(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Osi Ssel feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOsiSselPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ISOUpperLayer_osiSsel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ISOUpperLayer_osiSsel_feature",
                                "_UI_ISOUpperLayer_type" ),
                        CimPackage.eINSTANCE.getISOUpperLayer_OsiSsel(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Osi Tsel feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOsiTselPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ISOUpperLayer_osiTsel_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ISOUpperLayer_osiTsel_feature",
                                "_UI_ISOUpperLayer_type" ),
                        CimPackage.eINSTANCE.getISOUpperLayer_OsiTsel(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ISOUpperLayer.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ISOUpperLayer" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ISOUpperLayer ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ISOUpperLayer_type" )
                : getString( "_UI_ISOUpperLayer_type" ) + " " + label;
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

        switch( notification.getFeatureID( ISOUpperLayer.class ) ) {
        case CimPackage.ISO_UPPER_LAYER__AE_INVOKE:
        case CimPackage.ISO_UPPER_LAYER__AE_QUAL:
        case CimPackage.ISO_UPPER_LAYER__AP_INVOKE:
        case CimPackage.ISO_UPPER_LAYER__AP_TITLE:
        case CimPackage.ISO_UPPER_LAYER__OSI_PSEL:
        case CimPackage.ISO_UPPER_LAYER__OSI_SSEL:
        case CimPackage.ISO_UPPER_LAYER__OSI_TSEL:
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
