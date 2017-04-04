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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyDocumentItemProvider extends DocumentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SafetyDocumentItemProvider( AdapterFactory adapterFactory ) {
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

            addIssuedDateTimePropertyDescriptor( object );
            addReleasedDateTimePropertyDescriptor( object );
            addSwitchingPlanPropertyDescriptor( object );
            addIssuedBySupervisorPropertyDescriptor( object );
            addReleasedBySupervisorPropertyDescriptor( object );
            addReleasedToSupervisorPropertyDescriptor( object );
            addIssuedToSupervisorPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Issued Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIssuedDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SafetyDocument_issuedDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SafetyDocument_issuedDateTime_feature",
                                "_UI_SafetyDocument_type" ),
                        CimPackage.eINSTANCE.getSafetyDocument_IssuedDateTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Released Date Time feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReleasedDateTimePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SafetyDocument_releasedDateTime_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SafetyDocument_releasedDateTime_feature",
                                "_UI_SafetyDocument_type" ),
                        CimPackage.eINSTANCE.getSafetyDocument_ReleasedDateTime(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Switching Plan feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSwitchingPlanPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_SafetyDocument_SwitchingPlan_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_SafetyDocument_SwitchingPlan_feature",
                                "_UI_SafetyDocument_type" ),
                        CimPackage.eINSTANCE.getSafetyDocument_SwitchingPlan(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Issued By Supervisor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIssuedBySupervisorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SafetyDocument_IssuedBySupervisor_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SafetyDocument_IssuedBySupervisor_feature",
                        "_UI_SafetyDocument_type" ),
                CimPackage.eINSTANCE.getSafetyDocument_IssuedBySupervisor(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Released By Supervisor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReleasedBySupervisorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SafetyDocument_ReleasedBySupervisor_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SafetyDocument_ReleasedBySupervisor_feature",
                        "_UI_SafetyDocument_type" ),
                CimPackage.eINSTANCE.getSafetyDocument_ReleasedBySupervisor(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Released To Supervisor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReleasedToSupervisorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SafetyDocument_ReleasedToSupervisor_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SafetyDocument_ReleasedToSupervisor_feature",
                        "_UI_SafetyDocument_type" ),
                CimPackage.eINSTANCE.getSafetyDocument_ReleasedToSupervisor(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Issued To Supervisor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIssuedToSupervisorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(), getResourceLocator(),
                getString( "_UI_SafetyDocument_IssuedToSupervisor_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_SafetyDocument_IssuedToSupervisor_feature",
                        "_UI_SafetyDocument_type" ),
                CimPackage.eINSTANCE.getSafetyDocument_IssuedToSupervisor(), true, false, true, null, null, null ) );
    }

    /**
     * This returns SafetyDocument.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/SafetyDocument" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( SafetyDocument ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_SafetyDocument_type" )
                : getString( "_UI_SafetyDocument_type" ) + " " + label;
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

        switch( notification.getFeatureID( SafetyDocument.class ) ) {
        case CimPackage.SAFETY_DOCUMENT__ISSUED_DATE_TIME:
        case CimPackage.SAFETY_DOCUMENT__RELEASED_DATE_TIME:
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
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText( Object owner, Object feature, Object child, Collection< ? > selection ) {
        Object childFeature = feature;
        Object childObject = child;

        boolean qualify = childFeature == CimPackage.eINSTANCE.getDocument_DocStatus()
                || childFeature == CimPackage.eINSTANCE.getDocument_Status();

        if( qualify ) {
            return getString( "_UI_CreateChild_text2",
                    new Object[] { getTypeText( childObject ), getFeatureText( childFeature ), getTypeText( owner ) } );
        }
        return super.getCreateChildText( owner, feature, child, selection );
    }

}
