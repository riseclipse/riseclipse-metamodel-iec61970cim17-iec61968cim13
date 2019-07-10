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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroFrancis;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroFrancis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovHydroFrancisItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovHydroFrancisItemProvider( AdapterFactory adapterFactory ) {
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

            addAmPropertyDescriptor( object );
            addAv0PropertyDescriptor( object );
            addAv1PropertyDescriptor( object );
            addBpPropertyDescriptor( object );
            addDb1PropertyDescriptor( object );
            addEtamaxPropertyDescriptor( object );
            addGovernorControlPropertyDescriptor( object );
            addH1PropertyDescriptor( object );
            addH2PropertyDescriptor( object );
            addHnPropertyDescriptor( object );
            addKcPropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addKtPropertyDescriptor( object );
            addQc0PropertyDescriptor( object );
            addQnPropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTsPropertyDescriptor( object );
            addTwncPropertyDescriptor( object );
            addTwngPropertyDescriptor( object );
            addTxPropertyDescriptor( object );
            addVaPropertyDescriptor( object );
            addValvmaxPropertyDescriptor( object );
            addValvminPropertyDescriptor( object );
            addVcPropertyDescriptor( object );
            addWaterTunnelSurgeChamberSimulationPropertyDescriptor( object );
            addZsfcPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Am feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroFrancis_am_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_am_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Am(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getString( "_UI_GovHydroFrancis_av0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_av0_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Av0(),
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
                        getString( "_UI_GovHydroFrancis_av1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_av1_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Av1(),
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
                        getString( "_UI_GovHydroFrancis_bp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_bp_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Bp(),
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
                        getString( "_UI_GovHydroFrancis_db1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_db1_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Db1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Etamax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEtamaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroFrancis_etamax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_etamax_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Etamax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Governor Control feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addGovernorControlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroFrancis_governorControl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_governorControl_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_GovernorControl(),
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
                        getString( "_UI_GovHydroFrancis_h1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_h1_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_H1(),
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
                        getString( "_UI_GovHydroFrancis_h2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_h2_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_H2(),
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
                        getString( "_UI_GovHydroFrancis_hn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_hn_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Hn(),
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
                        getString( "_UI_GovHydroFrancis_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_kc_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Kc(),
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
                        getString( "_UI_GovHydroFrancis_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_kg_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Kg(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroFrancis_kt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_kt_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Kt(),
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
                        getString( "_UI_GovHydroFrancis_qc0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_qc0_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Qc0(),
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
                        getString( "_UI_GovHydroFrancis_qn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_qn_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Qn(),
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
                        getString( "_UI_GovHydroFrancis_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_ta_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Ta(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Td feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_GovHydroFrancis_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_td_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Td(),
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
                        getString( "_UI_GovHydroFrancis_ts_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_ts_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Ts(),
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
                        getString( "_UI_GovHydroFrancis_twnc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_twnc_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Twnc(),
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
                        getString( "_UI_GovHydroFrancis_twng_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_twng_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Twng(),
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
                        getString( "_UI_GovHydroFrancis_tx_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_tx_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Tx(),
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
                        getString( "_UI_GovHydroFrancis_va_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_va_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Va(),
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
                        getString( "_UI_GovHydroFrancis_valvmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_valvmax_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Valvmax(),
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
                        getString( "_UI_GovHydroFrancis_valvmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_valvmin_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Valvmin(),
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
                        getString( "_UI_GovHydroFrancis_vc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_vc_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Vc(),
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
                getString( "_UI_GovHydroFrancis_waterTunnelSurgeChamberSimulation_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_GovHydroFrancis_waterTunnelSurgeChamberSimulation_feature", "_UI_GovHydroFrancis_type" ),
                CimPackage.eINSTANCE.getGovHydroFrancis_WaterTunnelSurgeChamberSimulation(),
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
                        getString( "_UI_GovHydroFrancis_zsfc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovHydroFrancis_zsfc_feature",
                                "_UI_GovHydroFrancis_type" ),
                        CimPackage.eINSTANCE.getGovHydroFrancis_Zsfc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns GovHydroFrancis.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovHydroFrancis" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovHydroFrancis ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovHydroFrancis_type" )
                : getString( "_UI_GovHydroFrancis_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovHydroFrancis.class ) ) {
        case CimPackage.GOV_HYDRO_FRANCIS__AM:
        case CimPackage.GOV_HYDRO_FRANCIS__AV0:
        case CimPackage.GOV_HYDRO_FRANCIS__AV1:
        case CimPackage.GOV_HYDRO_FRANCIS__BP:
        case CimPackage.GOV_HYDRO_FRANCIS__DB1:
        case CimPackage.GOV_HYDRO_FRANCIS__ETAMAX:
        case CimPackage.GOV_HYDRO_FRANCIS__GOVERNOR_CONTROL:
        case CimPackage.GOV_HYDRO_FRANCIS__H1:
        case CimPackage.GOV_HYDRO_FRANCIS__H2:
        case CimPackage.GOV_HYDRO_FRANCIS__HN:
        case CimPackage.GOV_HYDRO_FRANCIS__KC:
        case CimPackage.GOV_HYDRO_FRANCIS__KG:
        case CimPackage.GOV_HYDRO_FRANCIS__KT:
        case CimPackage.GOV_HYDRO_FRANCIS__QC0:
        case CimPackage.GOV_HYDRO_FRANCIS__QN:
        case CimPackage.GOV_HYDRO_FRANCIS__TA:
        case CimPackage.GOV_HYDRO_FRANCIS__TD:
        case CimPackage.GOV_HYDRO_FRANCIS__TS:
        case CimPackage.GOV_HYDRO_FRANCIS__TWNC:
        case CimPackage.GOV_HYDRO_FRANCIS__TWNG:
        case CimPackage.GOV_HYDRO_FRANCIS__TX:
        case CimPackage.GOV_HYDRO_FRANCIS__VA:
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMAX:
        case CimPackage.GOV_HYDRO_FRANCIS__VALVMIN:
        case CimPackage.GOV_HYDRO_FRANCIS__VC:
        case CimPackage.GOV_HYDRO_FRANCIS__WATER_TUNNEL_SURGE_CHAMBER_SIMULATION:
        case CimPackage.GOV_HYDRO_FRANCIS__ZSFC:
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
