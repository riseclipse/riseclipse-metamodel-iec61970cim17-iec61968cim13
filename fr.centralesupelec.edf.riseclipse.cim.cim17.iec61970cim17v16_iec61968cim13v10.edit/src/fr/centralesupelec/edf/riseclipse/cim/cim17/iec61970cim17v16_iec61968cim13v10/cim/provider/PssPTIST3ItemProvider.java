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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssPTIST3;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssPTIST3} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PssPTIST3ItemProvider extends PowerSystemStabilizerDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PssPTIST3ItemProvider( AdapterFactory adapterFactory ) {
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

            addA0PropertyDescriptor( object );
            addA1PropertyDescriptor( object );
            addA2PropertyDescriptor( object );
            addA3PropertyDescriptor( object );
            addA4PropertyDescriptor( object );
            addA5PropertyDescriptor( object );
            addAlPropertyDescriptor( object );
            addAthresPropertyDescriptor( object );
            addB0PropertyDescriptor( object );
            addB1PropertyDescriptor( object );
            addB2PropertyDescriptor( object );
            addB3PropertyDescriptor( object );
            addB4PropertyDescriptor( object );
            addB5PropertyDescriptor( object );
            addDlPropertyDescriptor( object );
            addDtcPropertyDescriptor( object );
            addDtfPropertyDescriptor( object );
            addDtpPropertyDescriptor( object );
            addIswPropertyDescriptor( object );
            addKPropertyDescriptor( object );
            addLthresPropertyDescriptor( object );
            addMPropertyDescriptor( object );
            addNavPropertyDescriptor( object );
            addNclPropertyDescriptor( object );
            addNcrPropertyDescriptor( object );
            addPminPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addT2PropertyDescriptor( object );
            addT3PropertyDescriptor( object );
            addT4PropertyDescriptor( object );
            addT5PropertyDescriptor( object );
            addT6PropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addTpPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the A0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_a0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_a0_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_A0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_a1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_a1_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_A1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_a2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_a2_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_A2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_a3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_a3_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_A3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_a4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_a4_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_A4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the A5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addA5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_a5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_a5_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_A5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Al feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_al_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_al_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Al(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Athres feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAthresPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_athres_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_athres_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Athres(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_b0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_b0_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_B0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_b1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_b1_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_B1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_b2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_b2_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_B2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_b3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_b3_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_B3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_b4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_b4_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_B4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the B5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addB5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_b5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_b5_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_B5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_dl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_dl_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Dl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dtc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDtcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_dtc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_dtc_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Dtc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dtf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDtfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_dtf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_dtf_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Dtf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Dtp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDtpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_dtp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_dtp_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Dtp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Isw feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIswPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_isw_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_isw_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Isw(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_k_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_k_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_K(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lthres feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLthresPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_lthres_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_lthres_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Lthres(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the M feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_m_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_m_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_M(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Nav feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNavPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_nav_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_nav_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Nav(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ncl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNclPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_ncl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_ncl_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Ncl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ncr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNcrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_PssPTIST3_ncr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_ncr_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Ncr(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_pmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_pmin_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Pmin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_t1_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_T1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_t2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_t2_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_T2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_t3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_t3_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_T3(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_t4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_t4_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_T4(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_t5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_t5_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_T5(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_t6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_t6_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_T6(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_tf_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Tf(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_PssPTIST3_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PssPTIST3_tp_feature",
                                "_UI_PssPTIST3_type" ),
                        CimPackage.eINSTANCE.getPssPTIST3_Tp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns PssPTIST3.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PssPTIST3" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PssPTIST3 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PssPTIST3_type" )
                : getString( "_UI_PssPTIST3_type" ) + " " + label;
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

        switch( notification.getFeatureID( PssPTIST3.class ) ) {
        case CimPackage.PSS_PTIST3__A0:
        case CimPackage.PSS_PTIST3__A1:
        case CimPackage.PSS_PTIST3__A2:
        case CimPackage.PSS_PTIST3__A3:
        case CimPackage.PSS_PTIST3__A4:
        case CimPackage.PSS_PTIST3__A5:
        case CimPackage.PSS_PTIST3__AL:
        case CimPackage.PSS_PTIST3__ATHRES:
        case CimPackage.PSS_PTIST3__B0:
        case CimPackage.PSS_PTIST3__B1:
        case CimPackage.PSS_PTIST3__B2:
        case CimPackage.PSS_PTIST3__B3:
        case CimPackage.PSS_PTIST3__B4:
        case CimPackage.PSS_PTIST3__B5:
        case CimPackage.PSS_PTIST3__DL:
        case CimPackage.PSS_PTIST3__DTC:
        case CimPackage.PSS_PTIST3__DTF:
        case CimPackage.PSS_PTIST3__DTP:
        case CimPackage.PSS_PTIST3__ISW:
        case CimPackage.PSS_PTIST3__K:
        case CimPackage.PSS_PTIST3__LTHRES:
        case CimPackage.PSS_PTIST3__M:
        case CimPackage.PSS_PTIST3__NAV:
        case CimPackage.PSS_PTIST3__NCL:
        case CimPackage.PSS_PTIST3__NCR:
        case CimPackage.PSS_PTIST3__PMIN:
        case CimPackage.PSS_PTIST3__T1:
        case CimPackage.PSS_PTIST3__T2:
        case CimPackage.PSS_PTIST3__T3:
        case CimPackage.PSS_PTIST3__T4:
        case CimPackage.PSS_PTIST3__T5:
        case CimPackage.PSS_PTIST3__T6:
        case CimPackage.PSS_PTIST3__TF:
        case CimPackage.PSS_PTIST3__TP:
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
