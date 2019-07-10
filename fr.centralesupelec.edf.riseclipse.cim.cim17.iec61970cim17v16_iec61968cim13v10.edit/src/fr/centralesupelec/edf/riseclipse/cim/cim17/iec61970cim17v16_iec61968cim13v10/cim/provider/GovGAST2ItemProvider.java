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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovGAST2ItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovGAST2ItemProvider( AdapterFactory adapterFactory ) {
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

            addAPropertyDescriptor( object );
            addAf1PropertyDescriptor( object );
            addAf2PropertyDescriptor( object );
            addBPropertyDescriptor( object );
            addBf1PropertyDescriptor( object );
            addBf2PropertyDescriptor( object );
            addCPropertyDescriptor( object );
            addCf2PropertyDescriptor( object );
            addEcrPropertyDescriptor( object );
            addEtdPropertyDescriptor( object );
            addK3PropertyDescriptor( object );
            addK4PropertyDescriptor( object );
            addK5PropertyDescriptor( object );
            addK6PropertyDescriptor( object );
            addKfPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addTPropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addT5PropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTcdPropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addTmaxPropertyDescriptor( object );
            addTminPropertyDescriptor( object );
            addTrPropertyDescriptor( object );
            addTratePropertyDescriptor( object );
            addTtPropertyDescriptor( object );
            addWPropertyDescriptor( object );
            addXPropertyDescriptor( object );
            addYPropertyDescriptor( object );
            addZPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the A feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_a_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_a_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_A(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Af1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAf1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_af1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_af1_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Af1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Af2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAf2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_af2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_af2_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Af2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_b_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_b_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_B(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bf1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBf1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_bf1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_bf1_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Bf1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Bf2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBf2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_bf2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_bf2_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Bf2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the C feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_c_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_c_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_C(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Cf2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addCf2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_cf2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_cf2_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Cf2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ecr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEcrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_ecr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_ecr_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Ecr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Etd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEtdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_etd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_etd_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Etd(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_k3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_k3_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_K3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_k4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_k4_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_K4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_k5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_k5_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_K5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_k6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_k6_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_K6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_kf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_kf_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Kf(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_mwbase_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Mwbase(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_t_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_t_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_T(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_t3_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_T3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_t4_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_T4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_t5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_t5_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_T5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_tc_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tcd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTcdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_tcd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_tcd_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Tcd(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_tf_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Tf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_tmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_tmax_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Tmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_tmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_tmin_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Tmin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_tr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_tr_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Tr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Trate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTratePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_trate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_trate_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Trate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tt feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTtPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_tt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_tt_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Tt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the W feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_w_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_w_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_W(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the X feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_x_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_x_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_X(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGAST2_y_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_y_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Y(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Z feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addZPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGAST2_z_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGAST2_z_feature",
                                "_UI_GovGAST2_type" ),
                        CimPackage.eINSTANCE.getGovGAST2_Z(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovGAST2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovGAST2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovGAST2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovGAST2_type" )
                : getString( "_UI_GovGAST2_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovGAST2.class ) ) {
        case CimPackage.GOV_GAST2__A:
        case CimPackage.GOV_GAST2__AF1:
        case CimPackage.GOV_GAST2__AF2:
        case CimPackage.GOV_GAST2__B:
        case CimPackage.GOV_GAST2__BF1:
        case CimPackage.GOV_GAST2__BF2:
        case CimPackage.GOV_GAST2__C:
        case CimPackage.GOV_GAST2__CF2:
        case CimPackage.GOV_GAST2__ECR:
        case CimPackage.GOV_GAST2__ETD:
        case CimPackage.GOV_GAST2__K3:
        case CimPackage.GOV_GAST2__K4:
        case CimPackage.GOV_GAST2__K5:
        case CimPackage.GOV_GAST2__K6:
        case CimPackage.GOV_GAST2__KF:
        case CimPackage.GOV_GAST2__MWBASE:
        case CimPackage.GOV_GAST2__T:
        case CimPackage.GOV_GAST2__T3:
        case CimPackage.GOV_GAST2__T4:
        case CimPackage.GOV_GAST2__T5:
        case CimPackage.GOV_GAST2__TC:
        case CimPackage.GOV_GAST2__TCD:
        case CimPackage.GOV_GAST2__TF:
        case CimPackage.GOV_GAST2__TMAX:
        case CimPackage.GOV_GAST2__TMIN:
        case CimPackage.GOV_GAST2__TR:
        case CimPackage.GOV_GAST2__TRATE:
        case CimPackage.GOV_GAST2__TT:
        case CimPackage.GOV_GAST2__W:
        case CimPackage.GOV_GAST2__X:
        case CimPackage.GOV_GAST2__Y:
        case CimPackage.GOV_GAST2__Z:
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
