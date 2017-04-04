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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGASTWD;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGASTWD} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GovGASTWDItemProvider extends TurbineGovernorDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GovGASTWDItemProvider( AdapterFactory adapterFactory ) {
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
            addKdPropertyDescriptor( object );
            addKdroopPropertyDescriptor( object );
            addKfPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addMwbasePropertyDescriptor( object );
            addTPropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addT5PropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTcdPropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addTmaxPropertyDescriptor( object );
            addTminPropertyDescriptor( object );
            addTrPropertyDescriptor( object );
            addTratePropertyDescriptor( object );
            addTtPropertyDescriptor( object );
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_a_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_a_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_A(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_af1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_af1_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Af1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_af2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_af2_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Af2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_b_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_b_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_B(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_bf1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_bf1_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Bf1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_bf2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_bf2_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Bf2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_c_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_c_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_C(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_cf2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_cf2_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Cf2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_ecr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_ecr_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Ecr(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_etd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_etd_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Etd(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_k3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_k3_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_K3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_k4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_k4_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_K4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_k5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_k5_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_K5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_k6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_k6_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_K6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGASTWD_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_kd_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Kd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kdroop feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdroopPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGASTWD_kdroop_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_kdroop_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Kdroop(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_kf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_kf_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Kf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGASTWD_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_ki_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Ki(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_GovGASTWD_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_kp_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Kp(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_mwbase_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_mwbase_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Mwbase(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_t_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_t_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_T(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_t3_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_T3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_t4_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_T4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_t5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_t5_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_T5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_tc_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Tc(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_tcd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_tcd_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Tcd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_td_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Td(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_tf_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Tf(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_tmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_tmax_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Tmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_tmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_tmin_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Tmin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_tr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_tr_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Tr(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_trate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_trate_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Trate(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_GovGASTWD_tt_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_GovGASTWD_tt_feature",
                                "_UI_GovGASTWD_type" ),
                        CimPackage.eINSTANCE.getGovGASTWD_Tt(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns GovGASTWD.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/GovGASTWD" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( GovGASTWD ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_GovGASTWD_type" )
                : getString( "_UI_GovGASTWD_type" ) + " " + label;
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

        switch( notification.getFeatureID( GovGASTWD.class ) ) {
        case CimPackage.GOV_GASTWD__A:
        case CimPackage.GOV_GASTWD__AF1:
        case CimPackage.GOV_GASTWD__AF2:
        case CimPackage.GOV_GASTWD__B:
        case CimPackage.GOV_GASTWD__BF1:
        case CimPackage.GOV_GASTWD__BF2:
        case CimPackage.GOV_GASTWD__C:
        case CimPackage.GOV_GASTWD__CF2:
        case CimPackage.GOV_GASTWD__ECR:
        case CimPackage.GOV_GASTWD__ETD:
        case CimPackage.GOV_GASTWD__K3:
        case CimPackage.GOV_GASTWD__K4:
        case CimPackage.GOV_GASTWD__K5:
        case CimPackage.GOV_GASTWD__K6:
        case CimPackage.GOV_GASTWD__KD:
        case CimPackage.GOV_GASTWD__KDROOP:
        case CimPackage.GOV_GASTWD__KF:
        case CimPackage.GOV_GASTWD__KI:
        case CimPackage.GOV_GASTWD__KP:
        case CimPackage.GOV_GASTWD__MWBASE:
        case CimPackage.GOV_GASTWD__T:
        case CimPackage.GOV_GASTWD__T3:
        case CimPackage.GOV_GASTWD__T4:
        case CimPackage.GOV_GASTWD__T5:
        case CimPackage.GOV_GASTWD__TC:
        case CimPackage.GOV_GASTWD__TCD:
        case CimPackage.GOV_GASTWD__TD:
        case CimPackage.GOV_GASTWD__TF:
        case CimPackage.GOV_GASTWD__TMAX:
        case CimPackage.GOV_GASTWD__TMIN:
        case CimPackage.GOV_GASTWD__TR:
        case CimPackage.GOV_GASTWD__TRATE:
        case CimPackage.GOV_GASTWD__TT:
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
