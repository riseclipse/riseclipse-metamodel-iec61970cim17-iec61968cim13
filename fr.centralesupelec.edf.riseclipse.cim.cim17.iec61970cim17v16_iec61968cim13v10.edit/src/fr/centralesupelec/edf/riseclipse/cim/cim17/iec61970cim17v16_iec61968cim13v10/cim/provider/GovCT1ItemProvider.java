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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovCT1;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovCT1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovCT1ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovCT1ItemProvider( AdapterFactory adapterFactory ) {
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

            addAsetPropertyDescriptor( object );
            addDbPropertyDescriptor( object );
            addDmPropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKdgovPropertyDescriptor( object );
            addKigovPropertyDescriptor( object );
            addKiloadPropertyDescriptor( object );
            addKimwPropertyDescriptor( object );
            addKpgovPropertyDescriptor( object );
            addKploadPropertyDescriptor( object );
            addKturbPropertyDescriptor( object );
            addLdrefPropertyDescriptor( object );
            addMaxerrPropertyDescriptor( object );
            addMinerrPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addRPropertyDescriptor( object );
            addRclosePropertyDescriptor( object );
            addRdownPropertyDescriptor( object );
            addRopenPropertyDescriptor( object );
            addRselectPropertyDescriptor( object );
            addRupPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTactPropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTdgovPropertyDescriptor( object );
            addTengPropertyDescriptor( object );
            addTfloadPropertyDescriptor( object );
            addTpelecPropertyDescriptor( object );
            addTsaPropertyDescriptor( object );
            addTsbPropertyDescriptor( object );
            addVmaxPropertyDescriptor( object );
            addVminPropertyDescriptor( object );
            addWfnlPropertyDescriptor( object );
            addWfspdPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Aset feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsetPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_aset_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_aset_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Aset(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Db feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_db_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_db_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Db(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_dm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_dm_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Dm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ka feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_ka_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Ka(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kdgov feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdgovPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_kdgov_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_kdgov_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Kdgov(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kigov feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKigovPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_kigov_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_kigov_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Kigov(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kiload feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiloadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_kiload_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_kiload_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Kiload(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kimw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKimwPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_kimw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_kimw_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Kimw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpgov feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpgovPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_kpgov_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_kpgov_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Kpgov(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpload feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKploadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_kpload_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_kpload_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Kpload(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovCT1_kturb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_kturb_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Kturb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ldref feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLdrefPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_ldref_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_ldref_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Ldref(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Maxerr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxerrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_maxerr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_maxerr_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Maxerr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Minerr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinerrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_minerr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_minerr_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Minerr(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovCT1_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_mwbase_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the R feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_r_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_r_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_R(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rclose feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRclosePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_rclose_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_rclose_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Rclose(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rdown feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRdownPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_rdown_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_rdown_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Rdown(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ropen feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRopenPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_ropen_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_ropen_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Ropen(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rselect feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRselectPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_rselect_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_rselect_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Rselect(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rup feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRupPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_rup_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_rup_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Rup(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_ta_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tact feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTactPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_tact_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_tact_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Tact(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovCT1_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_tb_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Tb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_tc_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tdgov feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdgovPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_tdgov_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_tdgov_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Tdgov(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Teng feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTengPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_teng_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_teng_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Teng(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tfload feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfloadPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_tfload_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_tfload_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Tfload(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tpelec feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTpelecPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_tpelec_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_tpelec_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Tpelec(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tsa feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTsaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_tsa_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_tsa_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Tsa(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tsb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTsbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_tsb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_tsb_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Tsb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_vmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_vmax_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Vmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_vmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_vmin_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Vmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wfnl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWfnlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_wfnl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_wfnl_feature", "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Wfnl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Wfspd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWfspdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovCT1_wfspd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovCT1_wfspd_feature",
                                "_UI_GovCT1_type" ),
                        CimPackage.eINSTANCE.getGovCT1_Wfspd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovCT1.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovCT1" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovCT1 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovCT1_type" )
                : getString( "_UI_GovCT1_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovCT1.class ) ) {
        case CimPackage.GOV_CT1__ASET:
        case CimPackage.GOV_CT1__DB:
        case CimPackage.GOV_CT1__DM:
        case CimPackage.GOV_CT1__KA:
        case CimPackage.GOV_CT1__KDGOV:
        case CimPackage.GOV_CT1__KIGOV:
        case CimPackage.GOV_CT1__KILOAD:
        case CimPackage.GOV_CT1__KIMW:
        case CimPackage.GOV_CT1__KPGOV:
        case CimPackage.GOV_CT1__KPLOAD:
        case CimPackage.GOV_CT1__KTURB:
        case CimPackage.GOV_CT1__LDREF:
        case CimPackage.GOV_CT1__MAXERR:
        case CimPackage.GOV_CT1__MINERR:
        case CimPackage.GOV_CT1__MWBASE:
        case CimPackage.GOV_CT1__R:
        case CimPackage.GOV_CT1__RCLOSE:
        case CimPackage.GOV_CT1__RDOWN:
        case CimPackage.GOV_CT1__ROPEN:
        case CimPackage.GOV_CT1__RSELECT:
        case CimPackage.GOV_CT1__RUP:
        case CimPackage.GOV_CT1__TA:
        case CimPackage.GOV_CT1__TACT:
        case CimPackage.GOV_CT1__TB:
        case CimPackage.GOV_CT1__TC:
        case CimPackage.GOV_CT1__TDGOV:
        case CimPackage.GOV_CT1__TENG:
        case CimPackage.GOV_CT1__TFLOAD:
        case CimPackage.GOV_CT1__TPELEC:
        case CimPackage.GOV_CT1__TSA:
        case CimPackage.GOV_CT1__TSB:
        case CimPackage.GOV_CT1__VMAX:
        case CimPackage.GOV_CT1__VMIN:
        case CimPackage.GOV_CT1__WFNL:
        case CimPackage.GOV_CT1__WFSPD:
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
