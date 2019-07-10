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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadCompositeItemProvider extends LoadDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoadCompositeItemProvider( AdapterFactory adapterFactory ) {
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

            addEpfdPropertyDescriptor( object );
            addEpfsPropertyDescriptor( object );
            addEpvdPropertyDescriptor( object );
            addEpvsPropertyDescriptor( object );
            addEqfdPropertyDescriptor( object );
            addEqfsPropertyDescriptor( object );
            addEqvdPropertyDescriptor( object );
            addEqvsPropertyDescriptor( object );
            addHPropertyDescriptor( object );
            addLfracPropertyDescriptor( object );
            addPfracPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Epfd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEpfdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_epfd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_epfd_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Epfd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Epfs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEpfsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_epfs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_epfs_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Epfs(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Epvd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEpvdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_epvd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_epvd_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Epvd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Epvs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEpvsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_epvs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_epvs_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Epvs(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Eqfd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEqfdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_eqfd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_eqfd_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Eqfd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Eqfs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEqfsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_eqfs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_eqfs_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Eqfs(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Eqvd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEqvdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_eqvd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_eqvd_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Eqvd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Eqvs feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEqvsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_eqvs_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_eqvs_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Eqvs(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the H feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_h_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_h_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_H(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lfrac feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLfracPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_lfrac_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_lfrac_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Lfrac(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pfrac feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPfracPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_LoadComposite_pfrac_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_LoadComposite_pfrac_feature",
                                "_UI_LoadComposite_type" ),
                        CimPackage.eINSTANCE.getLoadComposite_Pfrac(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns LoadComposite.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/LoadComposite" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( LoadComposite ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_LoadComposite_type" )
                : getString( "_UI_LoadComposite_type" ) + " " + label;
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

        switch( notification.getFeatureID( LoadComposite.class ) ) {
        case CimPackage.LOAD_COMPOSITE__EPFD:
        case CimPackage.LOAD_COMPOSITE__EPFS:
        case CimPackage.LOAD_COMPOSITE__EPVD:
        case CimPackage.LOAD_COMPOSITE__EPVS:
        case CimPackage.LOAD_COMPOSITE__EQFD:
        case CimPackage.LOAD_COMPOSITE__EQFS:
        case CimPackage.LOAD_COMPOSITE__EQVD:
        case CimPackage.LOAD_COMPOSITE__EQVS:
        case CimPackage.LOAD_COMPOSITE__H:
        case CimPackage.LOAD_COMPOSITE__LFRAC:
        case CimPackage.LOAD_COMPOSITE__PFRAC:
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
