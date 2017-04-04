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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteam2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteam2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovSteam2ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovSteam2ItemProvider( AdapterFactory adapterFactory ) {
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

            addDbfPropertyDescriptor( object );
            addKPropertyDescriptor( object );
            addMnefPropertyDescriptor( object );
            addMxefPropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Dbf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDbfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteam2_dbf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteam2_dbf_feature",
                                "_UI_GovSteam2_type" ),
                        CimPackage.eINSTANCE.getGovSteam2_Dbf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteam2_k_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteam2_k_feature",
                                "_UI_GovSteam2_type" ),
                        CimPackage.eINSTANCE.getGovSteam2_K(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mnef feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMnefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteam2_mnef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteam2_mnef_feature",
                                "_UI_GovSteam2_type" ),
                        CimPackage.eINSTANCE.getGovSteam2_Mnef(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mxef feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMxefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteam2_mxef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteam2_mxef_feature",
                                "_UI_GovSteam2_type" ),
                        CimPackage.eINSTANCE.getGovSteam2_Mxef(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteam2_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteam2_pmax_feature",
                                "_UI_GovSteam2_type" ),
                        CimPackage.eINSTANCE.getGovSteam2_Pmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteam2_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteam2_pmin_feature",
                                "_UI_GovSteam2_type" ),
                        CimPackage.eINSTANCE.getGovSteam2_Pmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteam2_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteam2_t1_feature",
                                "_UI_GovSteam2_type" ),
                        CimPackage.eINSTANCE.getGovSteam2_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteam2_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteam2_t2_feature",
                                "_UI_GovSteam2_type" ),
                        CimPackage.eINSTANCE.getGovSteam2_T2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovSteam2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovSteam2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovSteam2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovSteam2_type" )
                : getString( "_UI_GovSteam2_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovSteam2.class ) ) {
        case CimPackage.GOV_STEAM2__DBF:
        case CimPackage.GOV_STEAM2__K:
        case CimPackage.GOV_STEAM2__MNEF:
        case CimPackage.GOV_STEAM2__MXEF:
        case CimPackage.GOV_STEAM2__PMAX:
        case CimPackage.GOV_STEAM2__PMIN:
        case CimPackage.GOV_STEAM2__T1:
        case CimPackage.GOV_STEAM2__T2:
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
