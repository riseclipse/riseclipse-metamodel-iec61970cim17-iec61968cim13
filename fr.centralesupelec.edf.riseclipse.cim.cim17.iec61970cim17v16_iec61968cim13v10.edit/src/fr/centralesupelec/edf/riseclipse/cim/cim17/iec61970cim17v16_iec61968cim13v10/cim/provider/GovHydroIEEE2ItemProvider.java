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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroIEEE2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydroIEEE2ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydroIEEE2ItemProvider( AdapterFactory adapterFactory ) {
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

            addAturbPropertyDescriptor( object );
            addBturbPropertyDescriptor( object );
            addGv1PropertyDescriptor( object );
            addGv2PropertyDescriptor( object );
            addGv3PropertyDescriptor( object );
            addGv4PropertyDescriptor( object );
            addGv5PropertyDescriptor( object );
            addGv6PropertyDescriptor( object );
            addKturbPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPgv1PropertyDescriptor( object );
            addPgv2PropertyDescriptor( object );
            addPgv3PropertyDescriptor( object );
            addPgv4PropertyDescriptor( object );
            addPgv5PropertyDescriptor( object );
            addPgv6PropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addRpermPropertyDescriptor( object );
            addRtempPropertyDescriptor( object );
            addTgPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addTrPropertyDescriptor( object );
            addTwPropertyDescriptor( object );
            addUcPropertyDescriptor( object );
            addUoPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_aturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_aturb_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Aturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_bturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_bturb_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Bturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_gv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_gv1_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Gv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_gv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_gv2_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Gv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_gv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_gv3_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Gv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_gv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_gv4_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Gv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_gv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_gv5_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Gv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Gv6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGv6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_gv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_gv6_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Gv6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kturb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKturbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_kturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_kturb_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Kturb(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_mwbase_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_pgv1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_pgv1_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Pgv1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_pgv2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_pgv2_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Pgv2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_pgv3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_pgv3_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Pgv3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_pgv4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_pgv4_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Pgv4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_pgv5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_pgv5_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Pgv5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pgv6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPgv6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_pgv6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_pgv6_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Pgv6(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_pmax_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Pmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_pmin_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Pmin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_rperm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_rperm_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Rperm(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_rtemp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_rtemp_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Rtemp(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_tg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_tg_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Tg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_tp_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Tp(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_tr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_tr_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Tr(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_tw_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Tw(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_uc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_uc_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Uc(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovHydroIEEE2_uo_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroIEEE2_uo_feature",
                                "_UI_GovHydroIEEE2_type" ),
                        CimPackage.eINSTANCE.getGovHydroIEEE2_Uo(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovHydroIEEE2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydroIEEE2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydroIEEE2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydroIEEE2_type" )
                : getString( "_UI_GovHydroIEEE2_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydroIEEE2.class ) ) {
        case CimPackage.GOV_HYDRO_IEEE2__ATURB:
        case CimPackage.GOV_HYDRO_IEEE2__BTURB:
        case CimPackage.GOV_HYDRO_IEEE2__GV1:
        case CimPackage.GOV_HYDRO_IEEE2__GV2:
        case CimPackage.GOV_HYDRO_IEEE2__GV3:
        case CimPackage.GOV_HYDRO_IEEE2__GV4:
        case CimPackage.GOV_HYDRO_IEEE2__GV5:
        case CimPackage.GOV_HYDRO_IEEE2__GV6:
        case CimPackage.GOV_HYDRO_IEEE2__KTURB:
        case CimPackage.GOV_HYDRO_IEEE2__MWBASE:
        case CimPackage.GOV_HYDRO_IEEE2__PGV1:
        case CimPackage.GOV_HYDRO_IEEE2__PGV2:
        case CimPackage.GOV_HYDRO_IEEE2__PGV3:
        case CimPackage.GOV_HYDRO_IEEE2__PGV4:
        case CimPackage.GOV_HYDRO_IEEE2__PGV5:
        case CimPackage.GOV_HYDRO_IEEE2__PGV6:
        case CimPackage.GOV_HYDRO_IEEE2__PMAX:
        case CimPackage.GOV_HYDRO_IEEE2__PMIN:
        case CimPackage.GOV_HYDRO_IEEE2__RPERM:
        case CimPackage.GOV_HYDRO_IEEE2__RTEMP:
        case CimPackage.GOV_HYDRO_IEEE2__TG:
        case CimPackage.GOV_HYDRO_IEEE2__TP:
        case CimPackage.GOV_HYDRO_IEEE2__TR:
        case CimPackage.GOV_HYDRO_IEEE2__TW:
        case CimPackage.GOV_HYDRO_IEEE2__UC:
        case CimPackage.GOV_HYDRO_IEEE2__UO:
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
