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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcREXS;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcREXS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcREXSItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcREXSItemProvider( AdapterFactory adapterFactory ) {
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

            addE1PropertyDescriptor( object );
            addE2PropertyDescriptor( object );
            addFbfPropertyDescriptor( object );
            addFlimfPropertyDescriptor( object );
            addKcPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKefdPropertyDescriptor( object );
            addKfPropertyDescriptor( object );
            addKhPropertyDescriptor( object );
            addKiiPropertyDescriptor( object );
            addKipPropertyDescriptor( object );
            addKsPropertyDescriptor( object );
            addKviPropertyDescriptor( object );
            addKvpPropertyDescriptor( object );
            addKvphzPropertyDescriptor( object );
            addNvphzPropertyDescriptor( object );
            addSe1PropertyDescriptor( object );
            addSe2PropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTb1PropertyDescriptor( object );
            addTb2PropertyDescriptor( object );
            addTc1PropertyDescriptor( object );
            addTc2PropertyDescriptor( object );
            addTePropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addTf1PropertyDescriptor( object );
            addTf2PropertyDescriptor( object );
            addTpPropertyDescriptor( object );
            addVcmaxPropertyDescriptor( object );
            addVfmaxPropertyDescriptor( object );
            addVfminPropertyDescriptor( object );
            addVimaxPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
            addXcPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the E1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addE1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_e1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_e1_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_E1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the E2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addE2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_e2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_e2_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_E2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Fbf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFbfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_fbf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_fbf_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Fbf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Flimf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFlimfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_flimf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_flimf_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Flimf(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kc_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kc(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kd_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kd(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_ke_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Ke(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kefd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKefdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_kefd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kefd_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kefd(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_kf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kf_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kf(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_kh_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kh_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kh(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kii feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_kii_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kii_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kii(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_kip_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kip_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kip(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_ks_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_ks_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Ks(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kvi feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKviPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_kvi_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kvi_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kvi(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kvp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKvpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_kvp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kvp_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kvp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kvphz feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKvphzPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_kvphz_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_kvphz_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Kvphz(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Nvphz feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNvphzPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_nvphz_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_nvphz_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Nvphz(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Se1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSe1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_se1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_se1_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Se1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Se2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSe2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_se2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_se2_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Se2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_ta_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_tb1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_tb1_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Tb1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTb2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_tb2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_tb2_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Tb2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTc1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_tc1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_tc1_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Tc1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTc2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_tc2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_tc2_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Tc2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_te_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_te_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Te(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_tf_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Tf(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_tf1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_tf1_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Tf1(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_tf2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_tf2_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Tf2(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_tp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_tp_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Tp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vcmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVcmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_vcmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_vcmax_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Vcmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vfmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVfmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_vfmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_vfmax_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Vfmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vfmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVfminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_vfmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_vfmin_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Vfmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vimax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVimaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_vimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_vimax_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Vimax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_vrmax_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Vrmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcREXS_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_vrmin_feature",
                                "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Vrmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Xc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcREXS_xc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcREXS_xc_feature", "_UI_ExcREXS_type" ),
                        CimPackage.eINSTANCE.getExcREXS_Xc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcREXS.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcREXS" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcREXS ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcREXS_type" )
                : getString( "_UI_ExcREXS_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcREXS.class ) ) {
        case CimPackage.EXC_REXS__E1:
        case CimPackage.EXC_REXS__E2:
        case CimPackage.EXC_REXS__FBF:
        case CimPackage.EXC_REXS__FLIMF:
        case CimPackage.EXC_REXS__KC:
        case CimPackage.EXC_REXS__KD:
        case CimPackage.EXC_REXS__KE:
        case CimPackage.EXC_REXS__KEFD:
        case CimPackage.EXC_REXS__KF:
        case CimPackage.EXC_REXS__KH:
        case CimPackage.EXC_REXS__KII:
        case CimPackage.EXC_REXS__KIP:
        case CimPackage.EXC_REXS__KS:
        case CimPackage.EXC_REXS__KVI:
        case CimPackage.EXC_REXS__KVP:
        case CimPackage.EXC_REXS__KVPHZ:
        case CimPackage.EXC_REXS__NVPHZ:
        case CimPackage.EXC_REXS__SE1:
        case CimPackage.EXC_REXS__SE2:
        case CimPackage.EXC_REXS__TA:
        case CimPackage.EXC_REXS__TB1:
        case CimPackage.EXC_REXS__TB2:
        case CimPackage.EXC_REXS__TC1:
        case CimPackage.EXC_REXS__TC2:
        case CimPackage.EXC_REXS__TE:
        case CimPackage.EXC_REXS__TF:
        case CimPackage.EXC_REXS__TF1:
        case CimPackage.EXC_REXS__TF2:
        case CimPackage.EXC_REXS__TP:
        case CimPackage.EXC_REXS__VCMAX:
        case CimPackage.EXC_REXS__VFMAX:
        case CimPackage.EXC_REXS__VFMIN:
        case CimPackage.EXC_REXS__VIMAX:
        case CimPackage.EXC_REXS__VRMAX:
        case CimPackage.EXC_REXS__VRMIN:
        case CimPackage.EXC_REXS__XC:
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
