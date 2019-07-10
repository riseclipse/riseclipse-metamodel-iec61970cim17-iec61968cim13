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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroPelton;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroPelton} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydroPeltonItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydroPeltonItemProvider( AdapterFactory adapterFactory ) {
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

            addAv0PropertyDescriptor( object );
            addAv1PropertyDescriptor( object );
            addBpPropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addDb2PropertyDescriptor( object );
            addH1PropertyDescriptor( object );
            addH2PropertyDescriptor( object );
            addHnPropertyDescriptor( object );
            addKcPropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addQc0PropertyDescriptor( object );
            addQnPropertyDescriptor( object );
            addSimplifiedPeltonPropertyDescriptor( object );
            addStaticCompensatingPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTsPropertyDescriptor( object );
            addTvPropertyDescriptor( object );
            addTwncPropertyDescriptor( object );
            addTwngPropertyDescriptor( object );
            addTxPropertyDescriptor( object );
            addVaPropertyDescriptor( object );
            addValvmaxPropertyDescriptor( object );
            addValvminPropertyDescriptor( object );
            addVavPropertyDescriptor( object );
            addVcPropertyDescriptor( object );
            addVcvPropertyDescriptor( object );
            addWaterTunnelSurgeChamberSimulationPropertyDescriptor( object );
            addZsfcPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Av0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAv0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_av0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_av0_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Av0(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Av1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAv1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_av1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_av1_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Av1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Bp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_bp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_bp_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Bp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_db1_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Db1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_db2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_db2_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Db2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the H1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addH1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_h1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_h1_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_H1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the H2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addH2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_h2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_h2_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_H2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Hn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_hn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_hn_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Hn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_kc_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Kc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_kg_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Kg(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Qc0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQc0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_qc0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_qc0_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Qc0(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Qn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_qn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_qn_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Qn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Simplified Pelton feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSimplifiedPeltonPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_simplifiedPelton_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_simplifiedPelton_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_SimplifiedPelton(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Static Compensating feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addStaticCompensatingPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_staticCompensating_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_GovHydroPelton_staticCompensating_feature", "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_StaticCompensating(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_ta_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Ta(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ts feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_ts_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_ts_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Ts(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_tv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_tv_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Tv(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Twnc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwncPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_twnc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_twnc_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Twnc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Twng feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTwngPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_twng_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_twng_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Twng(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tx feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_tx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_tx_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Tx(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Va feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_va_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_va_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Va(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Valvmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValvmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_valvmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_valvmax_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Valvmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Valvmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValvminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_valvmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_valvmin_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Valvmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vav feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVavPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_vav_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_vav_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Vav(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_vc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_vc_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Vc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vcv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVcvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_vcv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_vcv_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Vcv(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Water Tunnel Surge Chamber Simulation feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWaterTunnelSurgeChamberSimulationPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_GovHydroPelton_waterTunnelSurgeChamberSimulation_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_GovHydroPelton_waterTunnelSurgeChamberSimulation_feature", "_UI_GovHydroPelton_type" ),
                CimPackage.eINSTANCE.getGovHydroPelton_WaterTunnelSurgeChamberSimulation(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Zsfc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZsfcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroPelton_zsfc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroPelton_zsfc_feature",
                                "_UI_GovHydroPelton_type" ),
                        CimPackage.eINSTANCE.getGovHydroPelton_Zsfc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns GovHydroPelton.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydroPelton" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydroPelton ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydroPelton_type" )
                : getString( "_UI_GovHydroPelton_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydroPelton.class ) ) {
        case CimPackage.GOV_HYDRO_PELTON__AV0:
        case CimPackage.GOV_HYDRO_PELTON__AV1:
        case CimPackage.GOV_HYDRO_PELTON__BP:
        case CimPackage.GOV_HYDRO_PELTON__DB1:
        case CimPackage.GOV_HYDRO_PELTON__DB2:
        case CimPackage.GOV_HYDRO_PELTON__H1:
        case CimPackage.GOV_HYDRO_PELTON__H2:
        case CimPackage.GOV_HYDRO_PELTON__HN:
        case CimPackage.GOV_HYDRO_PELTON__KC:
        case CimPackage.GOV_HYDRO_PELTON__KG:
        case CimPackage.GOV_HYDRO_PELTON__QC0:
        case CimPackage.GOV_HYDRO_PELTON__QN:
        case CimPackage.GOV_HYDRO_PELTON__SIMPLIFIED_PELTON:
        case CimPackage.GOV_HYDRO_PELTON__STATIC_COMPENSATING:
        case CimPackage.GOV_HYDRO_PELTON__TA:
        case CimPackage.GOV_HYDRO_PELTON__TS:
        case CimPackage.GOV_HYDRO_PELTON__TV:
        case CimPackage.GOV_HYDRO_PELTON__TWNC:
        case CimPackage.GOV_HYDRO_PELTON__TWNG:
        case CimPackage.GOV_HYDRO_PELTON__TX:
        case CimPackage.GOV_HYDRO_PELTON__VA:
        case CimPackage.GOV_HYDRO_PELTON__VALVMAX:
        case CimPackage.GOV_HYDRO_PELTON__VALVMIN:
        case CimPackage.GOV_HYDRO_PELTON__VAV:
        case CimPackage.GOV_HYDRO_PELTON__VC:
        case CimPackage.GOV_HYDRO_PELTON__VCV:
        case CimPackage.GOV_HYDRO_PELTON__WATER_TUNNEL_SURGE_CHAMBER_SIMULATION:
        case CimPackage.GOV_HYDRO_PELTON__ZSFC:
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
