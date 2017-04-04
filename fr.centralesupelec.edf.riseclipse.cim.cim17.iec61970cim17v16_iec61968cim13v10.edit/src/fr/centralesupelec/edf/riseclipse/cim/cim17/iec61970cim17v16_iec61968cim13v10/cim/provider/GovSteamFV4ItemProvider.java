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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamFV4;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovSteamFV4} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovSteamFV4ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovSteamFV4ItemProvider( AdapterFactory adapterFactory ) {
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

            addCpsmnPropertyDescriptor( object );
            addCpsmxPropertyDescriptor( object );
            addCrmnPropertyDescriptor( object );
            addCrmxPropertyDescriptor( object );
            addKdcPropertyDescriptor( object );
            addKf1PropertyDescriptor( object );
            addKf3PropertyDescriptor( object );
            addKhpPropertyDescriptor( object );
            addKicPropertyDescriptor( object );
            addKipPropertyDescriptor( object );
            addKitPropertyDescriptor( object );
            addKmp1PropertyDescriptor( object );
            addKmp2PropertyDescriptor( object );
            addKpcPropertyDescriptor( object );
            addKppPropertyDescriptor( object );
            addKptPropertyDescriptor( object );
            addKrcPropertyDescriptor( object );
            addKshPropertyDescriptor( object );
            addLpiPropertyDescriptor( object );
            addLpsPropertyDescriptor( object );
            addMnefPropertyDescriptor( object );
            addMxefPropertyDescriptor( object );
            addPr1PropertyDescriptor( object );
            addPr2PropertyDescriptor( object );
            addPsmnPropertyDescriptor( object );
            addRsmimnPropertyDescriptor( object );
            addRsmimxPropertyDescriptor( object );
            addRvgmnPropertyDescriptor( object );
            addRvgmxPropertyDescriptor( object );
            addSrmnPropertyDescriptor( object );
            addSrmxPropertyDescriptor( object );
            addSrsmpPropertyDescriptor( object );
            addSvmnPropertyDescriptor( object );
            addSvmxPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTamPropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTcmPropertyDescriptor( object );
            addTdcPropertyDescriptor( object );
            addTf1PropertyDescriptor( object );
            addTf2PropertyDescriptor( object );
            addThpPropertyDescriptor( object );
            addTmpPropertyDescriptor( object );
            addTrhPropertyDescriptor( object );
            addTvPropertyDescriptor( object );
            addTyPropertyDescriptor( object );
            addYPropertyDescriptor( object );
            addYhpmnPropertyDescriptor( object );
            addYhpmxPropertyDescriptor( object );
            addYmpmnPropertyDescriptor( object );
            addYmpmxPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Cpsmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCpsmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_cpsmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_cpsmn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Cpsmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cpsmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCpsmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_cpsmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_cpsmx_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Cpsmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Crmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCrmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_crmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_crmn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Crmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Crmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCrmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_crmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_crmx_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Crmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kdc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kdc_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kf1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKf1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kf1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kf1_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kf1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kf3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKf3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kf3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kf3_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kf3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamFV4_khp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_khp_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Khp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kic feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKicPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kic_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kic_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kic(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kip feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKipPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kip_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kip(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kit_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kit_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kit(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kmp1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKmp1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kmp1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kmp1_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kmp1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kmp2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKmp2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kmp2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kmp2_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kmp2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kpc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kpc_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kpc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKppPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kpp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kpp_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kpp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kpt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKptPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_kpt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_kpt_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Kpt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Krc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKrcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_krc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_krc_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Krc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ksh feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKshPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_ksh_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_ksh_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Ksh(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lpi feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLpiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_lpi_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_lpi_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Lpi(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lps feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLpsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_lps_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_lps_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Lps(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamFV4_mnef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_mnef_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Mnef(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamFV4_mxef_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_mxef_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Mxef(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pr1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPr1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_pr1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_pr1_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Pr1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Pr2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPr2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_pr2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_pr2_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Pr2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Psmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPsmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_psmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_psmn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Psmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rsmimn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRsmimnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_rsmimn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_rsmimn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Rsmimn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rsmimx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRsmimxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_rsmimx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_rsmimx_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Rsmimx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rvgmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRvgmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_rvgmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_rvgmn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Rvgmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Rvgmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRvgmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_rvgmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_rvgmx_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Rvgmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Srmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_srmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_srmn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Srmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Srmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_srmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_srmx_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Srmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Srsmp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSrsmpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_srsmp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_srsmp_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Srsmp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Svmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_svmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_svmn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Svmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Svmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSvmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_svmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_svmx_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Svmx(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamFV4_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_ta_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tam feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTamPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_tam_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_tam_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Tam(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamFV4_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_tc_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tcm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_tcm_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_tcm_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Tcm(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tdc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_tdc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_tdc_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Tdc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tf1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTf1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_tf1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_tf1_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Tf1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tf2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTf2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_tf2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_tf2_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Tf2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamFV4_thp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_thp_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Thp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tmp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTmpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_tmp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_tmp_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Tmp(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovSteamFV4_trh_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_trh_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Trh(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_tv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_tv_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Tv(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ty feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_ty_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_ty_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Ty(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Y feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addYPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_y_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_y_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Y(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Yhpmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addYhpmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_yhpmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_yhpmn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Yhpmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Yhpmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addYhpmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_yhpmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_yhpmx_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Yhpmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ympmn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addYmpmnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_ympmn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_ympmn_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Ympmn(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ympmx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addYmpmxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovSteamFV4_ympmx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovSteamFV4_ympmx_feature",
                                "_UI_GovSteamFV4_type" ),
                        CimPackage.eINSTANCE.getGovSteamFV4_Ympmx(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovSteamFV4.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovSteamFV4" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovSteamFV4 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovSteamFV4_type" )
                : getString( "_UI_GovSteamFV4_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovSteamFV4.class ) ) {
        case CimPackage.GOV_STEAM_FV4__CPSMN:
        case CimPackage.GOV_STEAM_FV4__CPSMX:
        case CimPackage.GOV_STEAM_FV4__CRMN:
        case CimPackage.GOV_STEAM_FV4__CRMX:
        case CimPackage.GOV_STEAM_FV4__KDC:
        case CimPackage.GOV_STEAM_FV4__KF1:
        case CimPackage.GOV_STEAM_FV4__KF3:
        case CimPackage.GOV_STEAM_FV4__KHP:
        case CimPackage.GOV_STEAM_FV4__KIC:
        case CimPackage.GOV_STEAM_FV4__KIP:
        case CimPackage.GOV_STEAM_FV4__KIT:
        case CimPackage.GOV_STEAM_FV4__KMP1:
        case CimPackage.GOV_STEAM_FV4__KMP2:
        case CimPackage.GOV_STEAM_FV4__KPC:
        case CimPackage.GOV_STEAM_FV4__KPP:
        case CimPackage.GOV_STEAM_FV4__KPT:
        case CimPackage.GOV_STEAM_FV4__KRC:
        case CimPackage.GOV_STEAM_FV4__KSH:
        case CimPackage.GOV_STEAM_FV4__LPI:
        case CimPackage.GOV_STEAM_FV4__LPS:
        case CimPackage.GOV_STEAM_FV4__MNEF:
        case CimPackage.GOV_STEAM_FV4__MXEF:
        case CimPackage.GOV_STEAM_FV4__PR1:
        case CimPackage.GOV_STEAM_FV4__PR2:
        case CimPackage.GOV_STEAM_FV4__PSMN:
        case CimPackage.GOV_STEAM_FV4__RSMIMN:
        case CimPackage.GOV_STEAM_FV4__RSMIMX:
        case CimPackage.GOV_STEAM_FV4__RVGMN:
        case CimPackage.GOV_STEAM_FV4__RVGMX:
        case CimPackage.GOV_STEAM_FV4__SRMN:
        case CimPackage.GOV_STEAM_FV4__SRMX:
        case CimPackage.GOV_STEAM_FV4__SRSMP:
        case CimPackage.GOV_STEAM_FV4__SVMN:
        case CimPackage.GOV_STEAM_FV4__SVMX:
        case CimPackage.GOV_STEAM_FV4__TA:
        case CimPackage.GOV_STEAM_FV4__TAM:
        case CimPackage.GOV_STEAM_FV4__TC:
        case CimPackage.GOV_STEAM_FV4__TCM:
        case CimPackage.GOV_STEAM_FV4__TDC:
        case CimPackage.GOV_STEAM_FV4__TF1:
        case CimPackage.GOV_STEAM_FV4__TF2:
        case CimPackage.GOV_STEAM_FV4__THP:
        case CimPackage.GOV_STEAM_FV4__TMP:
        case CimPackage.GOV_STEAM_FV4__TRH:
        case CimPackage.GOV_STEAM_FV4__TV:
        case CimPackage.GOV_STEAM_FV4__TY:
        case CimPackage.GOV_STEAM_FV4__Y:
        case CimPackage.GOV_STEAM_FV4__YHPMN:
        case CimPackage.GOV_STEAM_FV4__YHPMX:
        case CimPackage.GOV_STEAM_FV4__YMPMN:
        case CimPackage.GOV_STEAM_FV4__YMPMX:
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
