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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydro1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydro1ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydro1ItemProvider( AdapterFactory adapterFactory ) {
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

            addAtPropertyDescriptor( object );
            addDturbPropertyDescriptor( object );
            addGmaxPropertyDescriptor( object );
            addGminPropertyDescriptor( object );
            addHdamPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addQnlPropertyDescriptor( object );
            addRpermPropertyDescriptor( object );
            addRtempPropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addTgPropertyDescriptor( object );
            addTrPropertyDescriptor( object );
            addTwPropertyDescriptor( object );
            addVelmPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the At feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_at_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_at_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_At(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_dturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_dturb_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Dturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_gmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_gmax_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Gmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_gmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_gmin_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Gmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hdam feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHdamPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_hdam_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_hdam_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Hdam(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydro1_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_mwbase_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Qnl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQnlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_qnl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_qnl_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Qnl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rperm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRpermPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_rperm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_rperm_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Rperm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rtemp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRtempPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_rtemp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_rtemp_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Rtemp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_tf_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Tf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_tg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_tg_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Tg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_tr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_tr_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Tr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_tw_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Tw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Velm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVelmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydro1_velm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydro1_velm_feature",
                                "_UI_GovHydro1_type" ),
                        CimPackage.eINSTANCE.getGovHydro1_Velm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovHydro1.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydro1" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydro1 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydro1_type" )
                : getString( "_UI_GovHydro1_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydro1.class ) ) {
        case CimPackage.GOV_HYDRO1__AT:
        case CimPackage.GOV_HYDRO1__DTURB:
        case CimPackage.GOV_HYDRO1__GMAX:
        case CimPackage.GOV_HYDRO1__GMIN:
        case CimPackage.GOV_HYDRO1__HDAM:
        case CimPackage.GOV_HYDRO1__MWBASE:
        case CimPackage.GOV_HYDRO1__QNL:
        case CimPackage.GOV_HYDRO1__RPERM:
        case CimPackage.GOV_HYDRO1__RTEMP:
        case CimPackage.GOV_HYDRO1__TF:
        case CimPackage.GOV_HYDRO1__TG:
        case CimPackage.GOV_HYDRO1__TR:
        case CimPackage.GOV_HYDRO1__TW:
        case CimPackage.GOV_HYDRO1__VELM:
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
