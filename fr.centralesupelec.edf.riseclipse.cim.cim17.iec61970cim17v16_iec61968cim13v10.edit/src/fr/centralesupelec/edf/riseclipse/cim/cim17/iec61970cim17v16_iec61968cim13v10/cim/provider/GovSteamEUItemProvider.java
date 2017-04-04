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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamEU;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamEU} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovSteamEUItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovSteamEUItemProvider( AdapterFactory adapterFactory ) {
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

            addChcPropertyDescriptor( object );
            addChoPropertyDescriptor( object );
            addCicPropertyDescriptor( object );
            addCioPropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addDb2PropertyDescriptor( object );
            addHhpmaxPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKfcorPropertyDescriptor( object );
            addKhpPropertyDescriptor( object );
            addKlpPropertyDescriptor( object );
            addKwcorPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addPmaxPropertyDescriptor( object );
            addPrhmaxPropertyDescriptor( object );
            addSimxPropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTdpPropertyDescriptor( object );
            addTenPropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addTfpPropertyDescriptor( object );
            addThpPropertyDescriptor( object );
            addTipPropertyDescriptor( object );
            addTlpPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addTrhPropertyDescriptor( object );
            addTvhpPropertyDescriptor( object );
            addTvipPropertyDescriptor( object );
            addTwPropertyDescriptor( object );
            addWfmaxPropertyDescriptor( object );
            addWfminPropertyDescriptor( object );
            addWmax1PropertyDescriptor( object );
            addWmax2PropertyDescriptor( object );
            addWwmaxPropertyDescriptor( object );
            addWwminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Chc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_chc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_chc_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Chc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cho feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addChoPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_cho_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_cho_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Cho(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cic feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCicPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_cic_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_cic_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Cic(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_cio_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_cio_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Cio(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_db1_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Db1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDb2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_db2_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Db2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Hhpmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHhpmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_hhpmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_hhpmax_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Hhpmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ke feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_ke_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Ke(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kfcor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKfcorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_kfcor_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_kfcor_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Kfcor(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Khp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKhpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_khp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_khp_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Khp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Klp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKlpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_klp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_klp_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Klp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kwcor feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKwcorPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_kwcor_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_kwcor_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Kwcor(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamEU_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_mwbase_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Mwbase(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamEU_pmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_pmax_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Pmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Prhmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPrhmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_prhmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_prhmax_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Prhmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Simx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSimxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_simx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_simx_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Simx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tb_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tdp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_tdp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tdp_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tdp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ten feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTenPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_ten_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_ten_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Ten(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamEU_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tf_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tfp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_tfp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tfp_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tfp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Thp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addThpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_thp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_thp_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Thp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_tip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tip_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tip(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tlp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTlpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_tlp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tlp_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tlp(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamEU_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tp_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Trh feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTrhPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_trh_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_trh_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Trh(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tvhp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTvhpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_tvhp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tvhp_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tvhp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tvip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTvipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_tvip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tvip_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tvip(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamEU_tw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_tw_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Tw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wfmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWfmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_wfmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_wfmax_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Wfmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wfmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWfminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_wfmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_wfmin_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Wfmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wmax1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWmax1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_wmax1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_wmax1_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Wmax1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wmax2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWmax2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_wmax2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_wmax2_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Wmax2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wwmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWwmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_wwmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_wwmax_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Wwmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wwmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWwminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamEU_wwmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamEU_wwmin_feature",
                                "_UI_GovSteamEU_type" ),
                        CimPackage.eINSTANCE.getGovSteamEU_Wwmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovSteamEU.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovSteamEU" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovSteamEU ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovSteamEU_type" )
                : getString( "_UI_GovSteamEU_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovSteamEU.class ) ) {
        case CimPackage.GOV_STEAM_EU__CHC:
        case CimPackage.GOV_STEAM_EU__CHO:
        case CimPackage.GOV_STEAM_EU__CIC:
        case CimPackage.GOV_STEAM_EU__CIO:
        case CimPackage.GOV_STEAM_EU__DB1:
        case CimPackage.GOV_STEAM_EU__DB2:
        case CimPackage.GOV_STEAM_EU__HHPMAX:
        case CimPackage.GOV_STEAM_EU__KE:
        case CimPackage.GOV_STEAM_EU__KFCOR:
        case CimPackage.GOV_STEAM_EU__KHP:
        case CimPackage.GOV_STEAM_EU__KLP:
        case CimPackage.GOV_STEAM_EU__KWCOR:
        case CimPackage.GOV_STEAM_EU__MWBASE:
        case CimPackage.GOV_STEAM_EU__PMAX:
        case CimPackage.GOV_STEAM_EU__PRHMAX:
        case CimPackage.GOV_STEAM_EU__SIMX:
        case CimPackage.GOV_STEAM_EU__TB:
        case CimPackage.GOV_STEAM_EU__TDP:
        case CimPackage.GOV_STEAM_EU__TEN:
        case CimPackage.GOV_STEAM_EU__TF:
        case CimPackage.GOV_STEAM_EU__TFP:
        case CimPackage.GOV_STEAM_EU__THP:
        case CimPackage.GOV_STEAM_EU__TIP:
        case CimPackage.GOV_STEAM_EU__TLP:
        case CimPackage.GOV_STEAM_EU__TP:
        case CimPackage.GOV_STEAM_EU__TRH:
        case CimPackage.GOV_STEAM_EU__TVHP:
        case CimPackage.GOV_STEAM_EU__TVIP:
        case CimPackage.GOV_STEAM_EU__TW:
        case CimPackage.GOV_STEAM_EU__WFMAX:
        case CimPackage.GOV_STEAM_EU__WFMIN:
        case CimPackage.GOV_STEAM_EU__WMAX1:
        case CimPackage.GOV_STEAM_EU__WMAX2:
        case CimPackage.GOV_STEAM_EU__WWMAX:
        case CimPackage.GOV_STEAM_EU__WWMIN:
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
