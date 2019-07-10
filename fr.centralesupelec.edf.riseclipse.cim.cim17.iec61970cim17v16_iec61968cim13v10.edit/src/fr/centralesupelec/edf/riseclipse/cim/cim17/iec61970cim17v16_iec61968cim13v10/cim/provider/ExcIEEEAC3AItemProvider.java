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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEAC3A;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEAC3A} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcIEEEAC3AItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEAC3AItemProvider( AdapterFactory adapterFactory ) {
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

            addEfdnPropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKcPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKfPropertyDescriptor( object );
            addKnPropertyDescriptor( object );
            addKrPropertyDescriptor( object );
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
            addVeminPropertyDescriptor( object );
            addVfemaxPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Efdn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfdnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC3A_efdn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_efdn_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Efdn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC3A_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_ka_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Ka(),
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
                        getString( "_UI_ExcIEEEAC3A_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_kc_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Kc(),
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
                        getString( "_UI_ExcIEEEAC3A_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_kd_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Kd(),
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
                        getString( "_UI_ExcIEEEAC3A_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_ke_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Ke(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC3A_kf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_kf_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Kf(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kn feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKnPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC3A_kn_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_kn_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Kn(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Kr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC3A_kr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_kr_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Kr(),
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
                        getString( "_UI_ExcIEEEAC3A_seve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_seve1_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Seve1(),
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
                        getString( "_UI_ExcIEEEAC3A_seve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_seve2_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Seve2(),
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
                        getString( "_UI_ExcIEEEAC3A_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_ta_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Ta(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC3A_tb_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_tb_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Tb(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
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
                        getResourceLocator(),
                        getString( "_UI_ExcIEEEAC3A_tc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_tc_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Tc(),
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
                        getString( "_UI_ExcIEEEAC3A_te_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_te_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Te(),
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
                        getString( "_UI_ExcIEEEAC3A_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_tf_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Tf(),
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
                        getString( "_UI_ExcIEEEAC3A_vamax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_vamax_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Vamax(),
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
                        getString( "_UI_ExcIEEEAC3A_vamin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_vamin_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Vamin(),
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
                        getString( "_UI_ExcIEEEAC3A_ve1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_ve1_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Ve1(),
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
                        getString( "_UI_ExcIEEEAC3A_ve2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_ve2_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Ve2(),
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
                        getString( "_UI_ExcIEEEAC3A_vemin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_vemin_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Vemin(),
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
                        getString( "_UI_ExcIEEEAC3A_vfemax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEAC3A_vfemax_feature",
                                "_UI_ExcIEEEAC3A_type" ),
                        CimPackage.eINSTANCE.getExcIEEEAC3A_Vfemax(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns ExcIEEEAC3A.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcIEEEAC3A" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcIEEEAC3A ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcIEEEAC3A_type" )
                : getString( "_UI_ExcIEEEAC3A_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcIEEEAC3A.class ) ) {
        case CimPackage.EXC_IEEEAC3A__EFDN:
        case CimPackage.EXC_IEEEAC3A__KA:
        case CimPackage.EXC_IEEEAC3A__KC:
        case CimPackage.EXC_IEEEAC3A__KD:
        case CimPackage.EXC_IEEEAC3A__KE:
        case CimPackage.EXC_IEEEAC3A__KF:
        case CimPackage.EXC_IEEEAC3A__KN:
        case CimPackage.EXC_IEEEAC3A__KR:
        case CimPackage.EXC_IEEEAC3A__SEVE1:
        case CimPackage.EXC_IEEEAC3A__SEVE2:
        case CimPackage.EXC_IEEEAC3A__TA:
        case CimPackage.EXC_IEEEAC3A__TB:
        case CimPackage.EXC_IEEEAC3A__TC:
        case CimPackage.EXC_IEEEAC3A__TE:
        case CimPackage.EXC_IEEEAC3A__TF:
        case CimPackage.EXC_IEEEAC3A__VAMAX:
        case CimPackage.EXC_IEEEAC3A__VAMIN:
        case CimPackage.EXC_IEEEAC3A__VE1:
        case CimPackage.EXC_IEEEAC3A__VE2:
        case CimPackage.EXC_IEEEAC3A__VEMIN:
        case CimPackage.EXC_IEEEAC3A__VFEMAX:
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
