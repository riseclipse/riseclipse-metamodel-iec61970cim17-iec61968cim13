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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamIEEE1;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamIEEE1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovSteamIEEE1ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovSteamIEEE1ItemProvider( AdapterFactory adapterFactory ) {
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

            addKPropertyDescriptor( object );
            addK1PropertyDescriptor( object );
            addK2PropertyDescriptor( object );
            addK3PropertyDescriptor( object );
            addK4PropertyDescriptor( object );
            addK5PropertyDescriptor( object );
            addK6PropertyDescriptor( object );
            addK7PropertyDescriptor( object );
            addK8PropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addT5PropertyDescriptor( object );
            addT6PropertyDescriptor( object );
            addT7PropertyDescriptor( object );
            addUcPropertyDescriptor( object );
            addUoPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k1_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k2_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k3_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k4_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k5_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k6_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k7_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_k8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_k8_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_K8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Mwbase feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMwbasePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_mwbase_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_Mwbase(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_pmax_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_Pmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_pmin_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_Pmin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_t1_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_T1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_t2_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_T2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_t3_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_T3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_t4_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_T4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_t5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_t5_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_T5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_t6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_t6_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_T6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_t7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_t7_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_T7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_uc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_uc_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_Uc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uo feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamIEEE1_uo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamIEEE1_uo_feature",
                                "_UI_GovSteamIEEE1_type" ),
                        CimPackage.eINSTANCE.getGovSteamIEEE1_Uo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovSteamIEEE1.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovSteamIEEE1" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovSteamIEEE1 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovSteamIEEE1_type" )
                : getString( "_UI_GovSteamIEEE1_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovSteamIEEE1.class ) ) {
        case CimPackage.GOV_STEAM_IEEE1__K:
        case CimPackage.GOV_STEAM_IEEE1__K1:
        case CimPackage.GOV_STEAM_IEEE1__K2:
        case CimPackage.GOV_STEAM_IEEE1__K3:
        case CimPackage.GOV_STEAM_IEEE1__K4:
        case CimPackage.GOV_STEAM_IEEE1__K5:
        case CimPackage.GOV_STEAM_IEEE1__K6:
        case CimPackage.GOV_STEAM_IEEE1__K7:
        case CimPackage.GOV_STEAM_IEEE1__K8:
        case CimPackage.GOV_STEAM_IEEE1__MWBASE:
        case CimPackage.GOV_STEAM_IEEE1__PMAX:
        case CimPackage.GOV_STEAM_IEEE1__PMIN:
        case CimPackage.GOV_STEAM_IEEE1__T1:
        case CimPackage.GOV_STEAM_IEEE1__T2:
        case CimPackage.GOV_STEAM_IEEE1__T3:
        case CimPackage.GOV_STEAM_IEEE1__T4:
        case CimPackage.GOV_STEAM_IEEE1__T5:
        case CimPackage.GOV_STEAM_IEEE1__T6:
        case CimPackage.GOV_STEAM_IEEE1__T7:
        case CimPackage.GOV_STEAM_IEEE1__UC:
        case CimPackage.GOV_STEAM_IEEE1__UO:
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
