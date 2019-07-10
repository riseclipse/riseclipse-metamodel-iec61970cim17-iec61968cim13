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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE2;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnderexcLimIEEE2ItemProvider extends UnderexcitationLimiterDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnderexcLimIEEE2ItemProvider( AdapterFactory adapterFactory ) {
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

            addK1PropertyDescriptor( object );
            addK2PropertyDescriptor( object );
            addKfbPropertyDescriptor( object );
            addKufPropertyDescriptor( object );
            addKuiPropertyDescriptor( object );
            addKulPropertyDescriptor( object );
            addP0PropertyDescriptor( object );
            addP1PropertyDescriptor( object );
            addP10PropertyDescriptor( object );
            addP2PropertyDescriptor( object );
            addP3PropertyDescriptor( object );
            addP4PropertyDescriptor( object );
            addP5PropertyDescriptor( object );
            addP6PropertyDescriptor( object );
            addP7PropertyDescriptor( object );
            addP8PropertyDescriptor( object );
            addP9PropertyDescriptor( object );
            addQ0PropertyDescriptor( object );
            addQ1PropertyDescriptor( object );
            addQ10PropertyDescriptor( object );
            addQ2PropertyDescriptor( object );
            addQ3PropertyDescriptor( object );
            addQ4PropertyDescriptor( object );
            addQ5PropertyDescriptor( object );
            addQ6PropertyDescriptor( object );
            addQ7PropertyDescriptor( object );
            addQ8PropertyDescriptor( object );
            addQ9PropertyDescriptor( object );
            addTu1PropertyDescriptor( object );
            addTu2PropertyDescriptor( object );
            addTu3PropertyDescriptor( object );
            addTu4PropertyDescriptor( object );
            addTulPropertyDescriptor( object );
            addTupPropertyDescriptor( object );
            addTuqPropertyDescriptor( object );
            addTuvPropertyDescriptor( object );
            addVuimaxPropertyDescriptor( object );
            addVuiminPropertyDescriptor( object );
            addVulmaxPropertyDescriptor( object );
            addVulminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the K1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_k1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_k1_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_K1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the K2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addK2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_k2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_k2_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_K2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kfb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKfbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_kfb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_kfb_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Kfb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kuf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKufPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_kuf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_kuf_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Kuf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kui feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKuiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_kui_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_kui_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Kui(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kul feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKulPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_kul_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_kul_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Kul(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p0_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p1_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p10_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P10(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p2_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p3_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p4_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p5_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p6_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p7_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p8_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the P9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addP9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_p9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_p9_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_P9(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q0 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ0PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q0_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q0_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q0(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q1_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q10 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ10PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q10_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q10_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q10(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q2_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q3_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q4_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q5 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ5PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q5_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q5_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q5(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q6 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ6PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q6_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q6_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q6(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q7 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ7PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q7_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q7_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q7(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q8 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ8PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q8_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q8_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q8(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Q9 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQ9PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_q9_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_q9_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Q9(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tu1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTu1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_tu1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_tu1_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Tu1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tu2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTu2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_tu2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_tu2_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Tu2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tu3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTu3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_tu3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_tu3_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Tu3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tu4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTu4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_tu4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_tu4_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Tu4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tul feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTulPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_tul_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_tul_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Tul(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tup feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTupPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_tup_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_tup_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Tup(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tuq feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTuqPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_tuq_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_tuq_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Tuq(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tuv feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTuvPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_tuv_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_tuv_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Tuv(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vuimax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVuimaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_vuimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_vuimax_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Vuimax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vuimin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVuiminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_vuimin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_vuimin_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Vuimin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vulmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVulmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_vulmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_vulmax_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Vulmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vulmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVulminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE2_vulmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE2_vulmin_feature",
                                "_UI_UnderexcLimIEEE2_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE2_Vulmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns UnderexcLimIEEE2.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/UnderexcLimIEEE2" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( UnderexcLimIEEE2 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_UnderexcLimIEEE2_type" )
                : getString( "_UI_UnderexcLimIEEE2_type" ) + " " + label;
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

        switch( notification.getFeatureID( UnderexcLimIEEE2.class ) ) {
        case CimPackage.UNDEREXC_LIM_IEEE2__K1:
        case CimPackage.UNDEREXC_LIM_IEEE2__K2:
        case CimPackage.UNDEREXC_LIM_IEEE2__KFB:
        case CimPackage.UNDEREXC_LIM_IEEE2__KUF:
        case CimPackage.UNDEREXC_LIM_IEEE2__KUI:
        case CimPackage.UNDEREXC_LIM_IEEE2__KUL:
        case CimPackage.UNDEREXC_LIM_IEEE2__P0:
        case CimPackage.UNDEREXC_LIM_IEEE2__P1:
        case CimPackage.UNDEREXC_LIM_IEEE2__P10:
        case CimPackage.UNDEREXC_LIM_IEEE2__P2:
        case CimPackage.UNDEREXC_LIM_IEEE2__P3:
        case CimPackage.UNDEREXC_LIM_IEEE2__P4:
        case CimPackage.UNDEREXC_LIM_IEEE2__P5:
        case CimPackage.UNDEREXC_LIM_IEEE2__P6:
        case CimPackage.UNDEREXC_LIM_IEEE2__P7:
        case CimPackage.UNDEREXC_LIM_IEEE2__P8:
        case CimPackage.UNDEREXC_LIM_IEEE2__P9:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q0:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q1:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q10:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q2:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q3:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q4:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q5:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q6:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q7:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q8:
        case CimPackage.UNDEREXC_LIM_IEEE2__Q9:
        case CimPackage.UNDEREXC_LIM_IEEE2__TU1:
        case CimPackage.UNDEREXC_LIM_IEEE2__TU2:
        case CimPackage.UNDEREXC_LIM_IEEE2__TU3:
        case CimPackage.UNDEREXC_LIM_IEEE2__TU4:
        case CimPackage.UNDEREXC_LIM_IEEE2__TUL:
        case CimPackage.UNDEREXC_LIM_IEEE2__TUP:
        case CimPackage.UNDEREXC_LIM_IEEE2__TUQ:
        case CimPackage.UNDEREXC_LIM_IEEE2__TUV:
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMAX:
        case CimPackage.UNDEREXC_LIM_IEEE2__VUIMIN:
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMAX:
        case CimPackage.UNDEREXC_LIM_IEEE2__VULMIN:
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
