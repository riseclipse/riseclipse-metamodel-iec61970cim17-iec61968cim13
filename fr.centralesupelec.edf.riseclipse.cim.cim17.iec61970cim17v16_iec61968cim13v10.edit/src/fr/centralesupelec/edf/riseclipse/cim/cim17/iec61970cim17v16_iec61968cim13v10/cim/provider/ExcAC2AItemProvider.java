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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAC2A;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcAC2A} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcAC2AItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcAC2AItemProvider( AdapterFactory adapterFactory ) {
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

            addHvgatePropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKbPropertyDescriptor( object );
            addKb1PropertyDescriptor( object );
            addKcPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKfPropertyDescriptor( object );
            addKhPropertyDescriptor( object );
            addKlPropertyDescriptor( object );
            addKl1PropertyDescriptor( object );
            addKsPropertyDescriptor( object );
            addLvgatePropertyDescriptor( object );
            addSeve1PropertyDescriptor( object );
            addSeve2PropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTbPropertyDescriptor( object );
            addTcPropertyDescriptor( object );
            addTePropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addVamaxPropertyDescriptor( object );
            addVaminPropertyDescriptor( object );
            addVe1PropertyDescriptor( object );
            addVe2PropertyDescriptor( object );
            addVfemaxPropertyDescriptor( object );
            addVlrPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Hvgate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHvgatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_hvgate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_hvgate_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Hvgate(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_ka_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Ka(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kb feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKbPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_kb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_kb_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Kb(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kb1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_kb1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_kb1_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Kb1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_kc_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Kc(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_kd_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Kd(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_ke_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Ke(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_kf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_kf_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Kf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kh feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKhPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_kh_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_kh_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Kh(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKlPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_kl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_kl_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Kl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kl1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKl1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_kl1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_kl1_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Kl1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ks feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_ks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_ks_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Ks(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Lvgate feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLvgatePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_lvgate_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_lvgate_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Lvgate(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seve1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeve1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_seve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_seve1_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Seve1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seve2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeve2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_seve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_seve2_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Seve2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_ta_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Ta(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_tb_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Tb(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_tc_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Tc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Te feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_te_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_te_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Te(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcAC2A_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_tf_feature", "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Tf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vamax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVamaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_vamax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_vamax_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Vamax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vamin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVaminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_vamin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_vamin_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Vamin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ve1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVe1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_ve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_ve1_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Ve1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ve2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVe2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_ve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_ve2_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Ve2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vfemax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVfemaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_vfemax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_vfemax_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Vfemax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vlr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVlrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_vlr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_vlr_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Vlr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_vrmax_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Vrmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcAC2A_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcAC2A_vrmin_feature",
                                "_UI_ExcAC2A_type" ),
                        CimPackage.eINSTANCE.getExcAC2A_Vrmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcAC2A.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcAC2A" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcAC2A ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcAC2A_type" )
                : getString( "_UI_ExcAC2A_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcAC2A.class ) ) {
        case CimPackage.EXC_AC2A__HVGATE:
        case CimPackage.EXC_AC2A__KA:
        case CimPackage.EXC_AC2A__KB:
        case CimPackage.EXC_AC2A__KB1:
        case CimPackage.EXC_AC2A__KC:
        case CimPackage.EXC_AC2A__KD:
        case CimPackage.EXC_AC2A__KE:
        case CimPackage.EXC_AC2A__KF:
        case CimPackage.EXC_AC2A__KH:
        case CimPackage.EXC_AC2A__KL:
        case CimPackage.EXC_AC2A__KL1:
        case CimPackage.EXC_AC2A__KS:
        case CimPackage.EXC_AC2A__LVGATE:
        case CimPackage.EXC_AC2A__SEVE1:
        case CimPackage.EXC_AC2A__SEVE2:
        case CimPackage.EXC_AC2A__TA:
        case CimPackage.EXC_AC2A__TB:
        case CimPackage.EXC_AC2A__TC:
        case CimPackage.EXC_AC2A__TE:
        case CimPackage.EXC_AC2A__TF:
        case CimPackage.EXC_AC2A__VAMAX:
        case CimPackage.EXC_AC2A__VAMIN:
        case CimPackage.EXC_AC2A__VE1:
        case CimPackage.EXC_AC2A__VE2:
        case CimPackage.EXC_AC2A__VFEMAX:
        case CimPackage.EXC_AC2A__VLR:
        case CimPackage.EXC_AC2A__VRMAX:
        case CimPackage.EXC_AC2A__VRMIN:
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
