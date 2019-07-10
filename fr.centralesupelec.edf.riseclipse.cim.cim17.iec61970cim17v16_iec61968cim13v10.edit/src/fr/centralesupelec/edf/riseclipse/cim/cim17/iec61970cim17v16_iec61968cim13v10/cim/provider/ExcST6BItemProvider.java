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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST6B;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST6B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcST6BItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcST6BItemProvider( AdapterFactory adapterFactory ) {
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

            addIlrPropertyDescriptor( object );
            addK1PropertyDescriptor( object );
            addKclPropertyDescriptor( object );
            addKffPropertyDescriptor( object );
            addKgPropertyDescriptor( object );
            addKiaPropertyDescriptor( object );
            addKlrPropertyDescriptor( object );
            addKmPropertyDescriptor( object );
            addKpaPropertyDescriptor( object );
            addKvdPropertyDescriptor( object );
            addOelinPropertyDescriptor( object );
            addTgPropertyDescriptor( object );
            addTsPropertyDescriptor( object );
            addTvdPropertyDescriptor( object );
            addVamaxPropertyDescriptor( object );
            addVaminPropertyDescriptor( object );
            addVilimPropertyDescriptor( object );
            addVimaxPropertyDescriptor( object );
            addViminPropertyDescriptor( object );
            addVmultPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
            addXcPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Ilr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIlrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_ilr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_ilr_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Ilr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ExcST6B_k1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_k1_feature", "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_K1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kcl feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKclPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_kcl_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_kcl_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Kcl(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kff feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKffPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_kff_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_kff_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Kff(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ExcST6B_kg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_kg_feature", "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Kg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ExcST6B_kia_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_kia_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Kia(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Klr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKlrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_klr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_klr_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Klr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Km feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_km_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_km_feature", "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Km(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ExcST6B_kpa_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_kpa_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Kpa(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kvd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKvdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_kvd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_kvd_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Kvd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Oelin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOelinPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_oelin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_oelin_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Oelin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tg feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTgPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_tg_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_tg_feature", "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Tg(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
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
                        getResourceLocator(), getString( "_UI_ExcST6B_ts_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_ts_feature", "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Ts(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tvd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTvdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_tvd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_tvd_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Tvd(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST6B_vamax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_vamax_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Vamax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST6B_vamin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_vamin_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Vamin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vilim feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVilimPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_vilim_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_vilim_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Vilim(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST6B_vimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_vimax_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Vimax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vimin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addViminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_vimin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_vimin_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Vimin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vmult feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVmultPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcST6B_vmult_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_vmult_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Vmult(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST6B_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_vrmax_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Vrmax(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST6B_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_vrmin_feature",
                                "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Vrmin(), true, false, false,
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
                        getResourceLocator(), getString( "_UI_ExcST6B_xc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcST6B_xc_feature", "_UI_ExcST6B_type" ),
                        CimPackage.eINSTANCE.getExcST6B_Xc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcST6B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcST6B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcST6B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcST6B_type" )
                : getString( "_UI_ExcST6B_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcST6B.class ) ) {
        case CimPackage.EXC_ST6B__ILR:
        case CimPackage.EXC_ST6B__K1:
        case CimPackage.EXC_ST6B__KCL:
        case CimPackage.EXC_ST6B__KFF:
        case CimPackage.EXC_ST6B__KG:
        case CimPackage.EXC_ST6B__KIA:
        case CimPackage.EXC_ST6B__KLR:
        case CimPackage.EXC_ST6B__KM:
        case CimPackage.EXC_ST6B__KPA:
        case CimPackage.EXC_ST6B__KVD:
        case CimPackage.EXC_ST6B__OELIN:
        case CimPackage.EXC_ST6B__TG:
        case CimPackage.EXC_ST6B__TS:
        case CimPackage.EXC_ST6B__TVD:
        case CimPackage.EXC_ST6B__VAMAX:
        case CimPackage.EXC_ST6B__VAMIN:
        case CimPackage.EXC_ST6B__VILIM:
        case CimPackage.EXC_ST6B__VIMAX:
        case CimPackage.EXC_ST6B__VIMIN:
        case CimPackage.EXC_ST6B__VMULT:
        case CimPackage.EXC_ST6B__VRMAX:
        case CimPackage.EXC_ST6B__VRMIN:
        case CimPackage.EXC_ST6B__XC:
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
