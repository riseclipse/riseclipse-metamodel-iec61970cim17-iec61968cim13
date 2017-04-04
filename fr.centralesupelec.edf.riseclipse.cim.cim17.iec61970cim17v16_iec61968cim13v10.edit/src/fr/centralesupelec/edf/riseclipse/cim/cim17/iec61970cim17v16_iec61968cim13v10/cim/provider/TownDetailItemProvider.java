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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TownDetail;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TownDetail} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TownDetailItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TownDetailItemProvider( AdapterFactory adapterFactory ) {
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

            addCodePropertyDescriptor( object );
            addCountryPropertyDescriptor( object );
            addNamePropertyDescriptor( object );
            addSectionPropertyDescriptor( object );
            addStateOrProvincePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Code feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCodePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TownDetail_code_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TownDetail_code_feature",
                                "_UI_TownDetail_type" ),
                        CimPackage.eINSTANCE.getTownDetail_Code(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Country feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCountryPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TownDetail_country_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TownDetail_country_feature",
                                "_UI_TownDetail_type" ),
                        CimPackage.eINSTANCE.getTownDetail_Country(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNamePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TownDetail_name_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TownDetail_name_feature",
                                "_UI_TownDetail_type" ),
                        CimPackage.eINSTANCE.getTownDetail_Name(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Section feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSectionPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TownDetail_section_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TownDetail_section_feature",
                                "_UI_TownDetail_type" ),
                        CimPackage.eINSTANCE.getTownDetail_Section(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the State Or Province feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStateOrProvincePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TownDetail_stateOrProvince_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TownDetail_stateOrProvince_feature",
                                "_UI_TownDetail_type" ),
                        CimPackage.eINSTANCE.getTownDetail_StateOrProvince(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns TownDetail.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TownDetail" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TownDetail ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TownDetail_type" )
                : getString( "_UI_TownDetail_type" ) + " " + label;
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

        switch( notification.getFeatureID( TownDetail.class ) ) {
        case CimPackage.TOWN_DETAIL__CODE:
        case CimPackage.TOWN_DETAIL__COUNTRY:
        case CimPackage.TOWN_DETAIL__NAME:
        case CimPackage.TOWN_DETAIL__SECTION:
        case CimPackage.TOWN_DETAIL__STATE_OR_PROVINCE:
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

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Iec61970cim17v16_iec61968cim13v10EditPlugin.INSTANCE;
    }

}
