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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEAC7B;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEAC7B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcIEEEAC7BItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEAC7BItemProvider( AdapterFactory adapterFactory ) {
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

            addKcPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKdrPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKf1PropertyDescriptor( object );
            addKf2PropertyDescriptor( object );
            addKf3PropertyDescriptor( object );
            addKiaPropertyDescriptor( object );
            addKirPropertyDescriptor( object );
            addKlPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addKpaPropertyDescriptor( object );
            addKprPropertyDescriptor( object );
            addSeve1PropertyDescriptor( object );
            addSeve2PropertyDescriptor( object );
            addTdrPropertyDescriptor( object );
            addTePropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addVamaxPropertyDescriptor( object );
            addVaminPropertyDescriptor( object );
            addVe1PropertyDescriptor( object );
            addVe2PropertyDescriptor( object );
            addVeminPropertyDescriptor( object );
            addVfemaxPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
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
                        getString( "_UI_ExcIEEEAC7B_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kc_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kc(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kd_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kd(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kdr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kdr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kdr_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kdr(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_ke_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Ke(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kf1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kf1_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kf1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kf2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKf2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kf2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kf2_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kf2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kf3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kf3_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kf3(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kia feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kia_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kia_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kia(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kir feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKirPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kir_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kir_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kir(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kl_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kl(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kp_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kp(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kpa feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kpa_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kpa_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kpa(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kpr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKprPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_kpr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_kpr_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Kpr(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_seve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_seve1_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Seve1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_seve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_seve2_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Seve2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Tdr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_tdr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_tdr_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Tdr(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_te_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_te_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Te(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_tf_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Tf(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_vamax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_vamax_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Vamax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_vamin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_vamin_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Vamin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_ve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_ve1_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Ve1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_ve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_ve2_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Ve2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Vemin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVeminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_vemin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_vemin_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Vemin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_vfemax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_vfemax_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Vfemax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_vrmax_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Vrmax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC7B_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC7B_vrmin_feature",
                                "_UI_ExcIEEEAC7B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC7B_Vrmin(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns ExcIEEEAC7B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcIEEEAC7B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcIEEEAC7B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcIEEEAC7B_type" )
                : getString( "_UI_ExcIEEEAC7B_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcIEEEAC7B.class ) ) {
        case CimPackage.EXC_IEEEAC7B__KC:
        case CimPackage.EXC_IEEEAC7B__KD:
        case CimPackage.EXC_IEEEAC7B__KDR:
        case CimPackage.EXC_IEEEAC7B__KE:
        case CimPackage.EXC_IEEEAC7B__KF1:
        case CimPackage.EXC_IEEEAC7B__KF2:
        case CimPackage.EXC_IEEEAC7B__KF3:
        case CimPackage.EXC_IEEEAC7B__KIA:
        case CimPackage.EXC_IEEEAC7B__KIR:
        case CimPackage.EXC_IEEEAC7B__KL:
        case CimPackage.EXC_IEEEAC7B__KP:
        case CimPackage.EXC_IEEEAC7B__KPA:
        case CimPackage.EXC_IEEEAC7B__KPR:
        case CimPackage.EXC_IEEEAC7B__SEVE1:
        case CimPackage.EXC_IEEEAC7B__SEVE2:
        case CimPackage.EXC_IEEEAC7B__TDR:
        case CimPackage.EXC_IEEEAC7B__TE:
        case CimPackage.EXC_IEEEAC7B__TF:
        case CimPackage.EXC_IEEEAC7B__VAMAX:
        case CimPackage.EXC_IEEEAC7B__VAMIN:
        case CimPackage.EXC_IEEEAC7B__VE1:
        case CimPackage.EXC_IEEEAC7B__VE2:
        case CimPackage.EXC_IEEEAC7B__VEMIN:
        case CimPackage.EXC_IEEEAC7B__VFEMAX:
        case CimPackage.EXC_IEEEAC7B__VRMAX:
        case CimPackage.EXC_IEEEAC7B__VRMIN:
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
